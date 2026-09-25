package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentUserActivityBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl1 mViewModelOnNextClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl mViewModelOnPreviousClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.ImageView mboundView1;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView10;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView11;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView12;
    private final android.widget.RelativeLayout mboundView13;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView14;
    private final android.widget.RelativeLayout mboundView15;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView16;
    private final android.widget.RelativeLayout mboundView17;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView18;
    private final android.widget.RelativeLayout mboundView19;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView20;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView21;
    private final android.widget.ImageView mboundView4;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView5;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView6;
    private final android.widget.RelativeLayout mboundView7;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView8;
    private final android.widget.RelativeLayout mboundView9;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.header_layout, 24);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.duration_title, 25);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.calories_title, 26);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.total_distance_title, 27);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.pace_title, 28);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.date_title, 29);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.time_title, 30);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.max_hr_title, 31);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.avg_hr_title, 32);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.ascended_title, 33);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.descended_title, 34);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.control_view_container, 35);
    }

    public FragmentUserActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }

    private FragmentUserActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 18, (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[33], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[32], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[26], (android.widget.FrameLayout) bindings[23], (android.widget.FrameLayout) bindings[35], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[29], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[34], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[25], (android.widget.LinearLayout) bindings[24], (android.widget.FrameLayout) bindings[22], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[31], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[28], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[3], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[30], (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[27]);
        this.mDirtyFlags = -1L;
        this.activityName.setTag(null);
        this.chartFragmentContainer.setTag(null);
        this.mapsFragmentContainer.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.ImageView imageView = (android.widget.ImageView) bindings[1];
        this.mboundView1 = imageView;
        imageView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[10];
        this.mboundView10 = fontableTextView;
        fontableTextView.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[11];
        this.mboundView11 = fontableTextView2;
        fontableTextView2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[12];
        this.mboundView12 = fontableTextView3;
        fontableTextView3.setTag(null);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) bindings[13];
        this.mboundView13 = relativeLayout;
        relativeLayout.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView4 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[14];
        this.mboundView14 = fontableTextView4;
        fontableTextView4.setTag(null);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) bindings[15];
        this.mboundView15 = relativeLayout2;
        relativeLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView5 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[16];
        this.mboundView16 = fontableTextView5;
        fontableTextView5.setTag(null);
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) bindings[17];
        this.mboundView17 = relativeLayout3;
        relativeLayout3.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView6 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[18];
        this.mboundView18 = fontableTextView6;
        fontableTextView6.setTag(null);
        android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) bindings[19];
        this.mboundView19 = relativeLayout4;
        relativeLayout4.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView7 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[20];
        this.mboundView20 = fontableTextView7;
        fontableTextView7.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView8 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[21];
        this.mboundView21 = fontableTextView8;
        fontableTextView8.setTag(null);
        android.widget.ImageView imageView2 = (android.widget.ImageView) bindings[4];
        this.mboundView4 = imageView2;
        imageView2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView9 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[5];
        this.mboundView5 = fontableTextView9;
        fontableTextView9.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView10 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[6];
        this.mboundView6 = fontableTextView10;
        fontableTextView10.setTag(null);
        android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) bindings[7];
        this.mboundView7 = relativeLayout5;
        relativeLayout5.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView11 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[8];
        this.mboundView8 = fontableTextView11;
        fontableTextView11.setTag(null);
        android.widget.RelativeLayout relativeLayout6 = (android.widget.RelativeLayout) bindings[9];
        this.mboundView9 = relativeLayout6;
        relativeLayout6.setTag(null);
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

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBinding
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
                return onChangeViewModelDate((androidx.databinding.ObservableField) object, fieldId);
            case 8:
                return onChangeViewModelActiveCals((androidx.databinding.ObservableField) object, fieldId);
            case 9:
                return onChangeViewModelAvgHeartRate((androidx.databinding.ObservableField) object, fieldId);
            case 10:
                return onChangeViewModelSubtitleField((androidx.databinding.ObservableField) object, fieldId);
            case 11:
                return onChangeViewModelStartTime((androidx.databinding.ObservableField) object, fieldId);
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

    private boolean onChangeViewModelDate(androidx.databinding.ObservableField<java.lang.String> ViewModelDate, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeViewModelActiveCals(androidx.databinding.ObservableField<java.lang.String> ViewModelActiveCals, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeViewModelAvgHeartRate(androidx.databinding.ObservableField<java.lang.String> ViewModelAvgHeartRate, int fieldId) {
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

    private boolean onChangeViewModelStartTime(androidx.databinding.ObservableField<java.lang.String> ViewModelStartTime, int fieldId) {
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

    /* JADX WARN: Code duplicated, block: B:100:0x0184  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:129:0x0200  */
    /* JADX WARN: Code duplicated, block: B:133:0x020f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0211  */
    /* JADX WARN: Code duplicated, block: B:135:0x0218  */
    /* JADX WARN: Code duplicated, block: B:138:0x0223  */
    /* JADX WARN: Code duplicated, block: B:139:0x022a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x0238  */
    /* JADX WARN: Code duplicated, block: B:145:0x023f  */
    /* JADX WARN: Code duplicated, block: B:148:0x024a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0251  */
    /* JADX WARN: Code duplicated, block: B:151:0x0262  */
    /* JADX WARN: Code duplicated, block: B:154:0x0271 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0273  */
    /* JADX WARN: Code duplicated, block: B:156:0x0280  */
    /* JADX WARN: Code duplicated, block: B:159:0x028d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0294  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:174:0x02cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:185:0x0300 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0302  */
    /* JADX WARN: Code duplicated, block: B:187:0x030f  */
    /* JADX WARN: Code duplicated, block: B:190:0x031c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0323  */
    /* JADX WARN: Code duplicated, block: B:195:0x0331 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0333  */
    /* JADX WARN: Code duplicated, block: B:197:0x033a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0345  */
    /* JADX WARN: Code duplicated, block: B:202:0x0372  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl value;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl1 value2;
        java.lang.Boolean bool;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zSafeUnbox;
        boolean zSafeUnbox2;
        boolean zSafeUnbox3;
        boolean z4;
        boolean zSafeUnbox4;
        boolean z5;
        java.lang.String str13;
        java.lang.String str14;
        boolean zSafeUnbox5;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String str20;
        boolean zSafeUnbox6;
        boolean zSafeUnbox7;
        java.lang.String str21;
        java.lang.String str22;
        androidx.databinding.ObservableField<java.lang.Boolean> rightArrowVisible;
        java.lang.String str23;
        androidx.databinding.ObservableField<java.lang.Boolean> hasHeartRates;
        androidx.databinding.ObservableField<java.lang.String> pace;
        androidx.databinding.ObservableField<java.lang.String> totalDescendedValue;
        androidx.databinding.ObservableField<java.lang.String> totalAscendedValue;
        androidx.databinding.ObservableField<java.lang.Boolean> hasLocations;
        java.lang.Boolean bool2;
        androidx.databinding.ObservableField<java.lang.String> startTime;
        androidx.databinding.ObservableField<java.lang.String> subtitleField;
        androidx.databinding.ObservableField<java.lang.String> avgHeartRate;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel userActivityViewModel = this.mViewModel;
        androidx.databinding.ObservableField<java.lang.Boolean> rightArrowVisible2 = null;
        if ((1048575 & j) != 0) {
            if ((j & 786433) == 0) {
                str13 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> maxHRValue = userActivityViewModel != null ? userActivityViewModel.getMaxHRValue() : null;
                updateRegistration(0, maxHRValue);
                if (maxHRValue != null) {
                    str13 = maxHRValue.get();
                } else {
                    str13 = null;
                }
            }
            if ((j & 786432) == 0 || userActivityViewModel == null) {
                value = null;
                value2 = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl onClickListenerImpl = this.mViewModelOnPreviousClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl == null) {
                    onClickListenerImpl = new powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl();
                    this.mViewModelOnPreviousClickedAndroidViewViewOnClickListener = onClickListenerImpl;
                }
                value = onClickListenerImpl.setValue(userActivityViewModel);
                powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl1 onClickListenerImpl1 = this.mViewModelOnNextClickedAndroidViewViewOnClickListener;
                if (onClickListenerImpl1 == null) {
                    onClickListenerImpl1 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl1();
                    this.mViewModelOnNextClickedAndroidViewViewOnClickListener = onClickListenerImpl1;
                }
                value2 = onClickListenerImpl1.setValue(userActivityViewModel);
            }
            if ((j & 786434) == 0) {
                str14 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> distance = userActivityViewModel != null ? userActivityViewModel.getDistance() : null;
                updateRegistration(1, distance);
                if (distance != null) {
                    str14 = distance.get();
                } else {
                    str14 = null;
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
                zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(ascendDisplayed != null ? ascendDisplayed.get() : null);
            } else {
                zSafeUnbox5 = false;
            }
            if ((j & 786448) == 0) {
                str15 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> duration = userActivityViewModel != null ? userActivityViewModel.getDuration() : null;
                updateRegistration(4, duration);
                if (duration != null) {
                    str15 = duration.get();
                } else {
                    str15 = null;
                }
            }
            long j2 = j & 819232;
            if (j2 != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> leftArrowVisible = userActivityViewModel != null ? userActivityViewModel.getLeftArrowVisible() : null;
                updateRegistration(5, leftArrowVisible);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(leftArrowVisible != null ? leftArrowVisible.get() : null);
                if (j2 != 0) {
                    j = zSafeUnbox2 ? j | android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : j | android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                }
            } else {
                zSafeUnbox2 = false;
            }
            if ((j & 786496) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> hiitActivityDisplayed = userActivityViewModel != null ? userActivityViewModel.getHiitActivityDisplayed() : null;
                updateRegistration(6, hiitActivityDisplayed);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(hiitActivityDisplayed != null ? hiitActivityDisplayed.get() : null);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox));
            } else {
                zSafeUnbox = false;
                zSafeUnbox3 = false;
            }
            if ((j & 786560) == 0) {
                str16 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> date = userActivityViewModel != null ? userActivityViewModel.getDate() : null;
                updateRegistration(7, date);
                if (date != null) {
                    str16 = date.get();
                } else {
                    str16 = null;
                }
            }
            if ((j & 786688) != 0) {
                androidx.databinding.ObservableField<java.lang.String> activeCals = userActivityViewModel != null ? userActivityViewModel.getActiveCals() : null;
                updateRegistration(8, activeCals);
                if (activeCals != null) {
                    str17 = activeCals.get();
                }
                if ((j & 786944) != 0) {
                    if (userActivityViewModel != null) {
                        avgHeartRate = userActivityViewModel.getAvgHeartRate();
                    } else {
                        avgHeartRate = null;
                    }
                    updateRegistration(9, avgHeartRate);
                    if (avgHeartRate != null) {
                        str18 = avgHeartRate.get();
                    }
                    if ((j & 787456) != 0) {
                        if (userActivityViewModel != null) {
                            subtitleField = userActivityViewModel.getSubtitleField();
                        } else {
                            subtitleField = null;
                        }
                        updateRegistration(10, subtitleField);
                        if (subtitleField != null) {
                            str19 = subtitleField.get();
                        }
                        if ((j & 788480) != 0) {
                            if (userActivityViewModel != null) {
                                startTime = userActivityViewModel.getStartTime();
                            } else {
                                startTime = null;
                            }
                            updateRegistration(11, startTime);
                            if (startTime != null) {
                                str20 = startTime.get();
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
                                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                                zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                            } else {
                                str20 = str20;
                                zSafeUnbox6 = false;
                                zSafeUnbox7 = false;
                            }
                            if ((j & 794624) != 0) {
                                if (userActivityViewModel != null) {
                                    totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                                } else {
                                    totalAscendedValue = null;
                                }
                                updateRegistration(13, totalAscendedValue);
                                if (totalAscendedValue != null) {
                                    str21 = totalAscendedValue.get();
                                }
                                if ((j & 802816) != 0) {
                                    if (userActivityViewModel != null) {
                                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                    } else {
                                        totalDescendedValue = null;
                                    }
                                    updateRegistration(14, totalDescendedValue);
                                    if (totalDescendedValue != null) {
                                        str22 = totalDescendedValue.get();
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
                                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                    } else {
                                        str22 = str22;
                                        bool = null;
                                        rightArrowVisible = null;
                                        zSafeUnbox4 = false;
                                    }
                                    if ((j & 851968) != 0) {
                                        if (userActivityViewModel != null) {
                                            pace = userActivityViewModel.getPace();
                                        } else {
                                            pace = null;
                                        }
                                        updateRegistration(16, pace);
                                        if (pace != null) {
                                            str23 = pace.get();
                                        }
                                        if ((j & 917504) != 0) {
                                            if (userActivityViewModel != null) {
                                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                                            } else {
                                                hasHeartRates = null;
                                            }
                                            updateRegistration(17, hasHeartRates);
                                            boolean zSafeUnbox8 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                            str5 = str13;
                                            str11 = str14;
                                            str9 = str15;
                                            str4 = str16;
                                            str10 = str17;
                                            str6 = str18;
                                            str12 = str19;
                                            z2 = zSafeUnbox6;
                                            z3 = zSafeUnbox7;
                                            str7 = str21;
                                            str8 = str22;
                                            rightArrowVisible2 = rightArrowVisible;
                                            str = str23;
                                            z4 = zSafeUnbox5;
                                            str3 = str20;
                                            z = zSafeUnbox8;
                                            j = j;
                                        } else {
                                            str5 = str13;
                                            str11 = str14;
                                            str9 = str15;
                                            str4 = str16;
                                            str10 = str17;
                                            str6 = str18;
                                            str12 = str19;
                                            z2 = zSafeUnbox6;
                                            z3 = zSafeUnbox7;
                                            str7 = str21;
                                            str8 = str22;
                                            rightArrowVisible2 = rightArrowVisible;
                                            str = str23;
                                            z4 = zSafeUnbox5;
                                            str3 = str20;
                                            z = false;
                                        }
                                    } else {
                                        bool = bool;
                                        rightArrowVisible = rightArrowVisible;
                                    }
                                    str23 = null;
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        boolean zSafeUnbox9 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = zSafeUnbox9;
                                        j = j;
                                    } else {
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = false;
                                    }
                                } else {
                                    str21 = str21;
                                }
                                str22 = null;
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
                                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                } else {
                                    str22 = str22;
                                    bool = null;
                                    rightArrowVisible = null;
                                    zSafeUnbox4 = false;
                                }
                                if ((j & 851968) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str23 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        boolean zSafeUnbox10 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = zSafeUnbox10;
                                        j = j;
                                    } else {
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = false;
                                    }
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str23 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox11 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox11;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                zSafeUnbox6 = zSafeUnbox6;
                                zSafeUnbox7 = zSafeUnbox7;
                            }
                            str21 = null;
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str22 = totalDescendedValue.get();
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
                                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                } else {
                                    str22 = str22;
                                    bool = null;
                                    rightArrowVisible = null;
                                    zSafeUnbox4 = false;
                                }
                                if ((j & 851968) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str23 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        boolean zSafeUnbox12 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = zSafeUnbox12;
                                        j = j;
                                    } else {
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = false;
                                    }
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str23 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox13 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox13;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                str21 = str21;
                            }
                            str22 = null;
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox14 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox14;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox15 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox15;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str19 = str19;
                        }
                        str20 = null;
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
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                            zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                        } else {
                            str20 = str20;
                            zSafeUnbox6 = false;
                            zSafeUnbox7 = false;
                        }
                        if ((j & 794624) != 0) {
                            if (userActivityViewModel != null) {
                                totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                            } else {
                                totalAscendedValue = null;
                            }
                            updateRegistration(13, totalAscendedValue);
                            if (totalAscendedValue != null) {
                                str21 = totalAscendedValue.get();
                            }
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str22 = totalDescendedValue.get();
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
                                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                } else {
                                    str22 = str22;
                                    bool = null;
                                    rightArrowVisible = null;
                                    zSafeUnbox4 = false;
                                }
                                if ((j & 851968) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str23 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        boolean zSafeUnbox16 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = zSafeUnbox16;
                                        j = j;
                                    } else {
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = false;
                                    }
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str23 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox17 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox17;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                str21 = str21;
                            }
                            str22 = null;
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox18 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox18;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox19 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox19;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            zSafeUnbox6 = zSafeUnbox6;
                            zSafeUnbox7 = zSafeUnbox7;
                        }
                        str21 = null;
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox110;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox112;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox113;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str18 = str18;
                    }
                    str19 = null;
                    if ((j & 788480) != 0) {
                        if (userActivityViewModel != null) {
                            startTime = userActivityViewModel.getStartTime();
                        } else {
                            startTime = null;
                        }
                        updateRegistration(11, startTime);
                        if (startTime != null) {
                            str20 = startTime.get();
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
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                            zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                        } else {
                            str20 = str20;
                            zSafeUnbox6 = false;
                            zSafeUnbox7 = false;
                        }
                        if ((j & 794624) != 0) {
                            if (userActivityViewModel != null) {
                                totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                            } else {
                                totalAscendedValue = null;
                            }
                            updateRegistration(13, totalAscendedValue);
                            if (totalAscendedValue != null) {
                                str21 = totalAscendedValue.get();
                            }
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str22 = totalDescendedValue.get();
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
                                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                } else {
                                    str22 = str22;
                                    bool = null;
                                    rightArrowVisible = null;
                                    zSafeUnbox4 = false;
                                }
                                if ((j & 851968) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str23 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        boolean zSafeUnbox114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = zSafeUnbox114;
                                        j = j;
                                    } else {
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = false;
                                    }
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str23 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox115;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                str21 = str21;
                            }
                            str22 = null;
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox116;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox117;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            zSafeUnbox6 = zSafeUnbox6;
                            zSafeUnbox7 = zSafeUnbox7;
                        }
                        str21 = null;
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox118;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox119;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1110;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str19 = str19;
                    }
                    str20 = null;
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
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                    } else {
                        str20 = str20;
                        zSafeUnbox6 = false;
                        zSafeUnbox7 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str21 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox1112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox1112;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1113;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1114;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1115;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        zSafeUnbox6 = zSafeUnbox6;
                        zSafeUnbox7 = zSafeUnbox7;
                    }
                    str21 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1116;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1117;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1118;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1119;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str17 = str17;
                }
                str18 = null;
                if ((j & 787456) != 0) {
                    if (userActivityViewModel != null) {
                        subtitleField = userActivityViewModel.getSubtitleField();
                    } else {
                        subtitleField = null;
                    }
                    updateRegistration(10, subtitleField);
                    if (subtitleField != null) {
                        str19 = subtitleField.get();
                    }
                    if ((j & 788480) != 0) {
                        if (userActivityViewModel != null) {
                            startTime = userActivityViewModel.getStartTime();
                        } else {
                            startTime = null;
                        }
                        updateRegistration(11, startTime);
                        if (startTime != null) {
                            str20 = startTime.get();
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
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                            zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                        } else {
                            str20 = str20;
                            zSafeUnbox6 = false;
                            zSafeUnbox7 = false;
                        }
                        if ((j & 794624) != 0) {
                            if (userActivityViewModel != null) {
                                totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                            } else {
                                totalAscendedValue = null;
                            }
                            updateRegistration(13, totalAscendedValue);
                            if (totalAscendedValue != null) {
                                str21 = totalAscendedValue.get();
                            }
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str22 = totalDescendedValue.get();
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
                                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                } else {
                                    str22 = str22;
                                    bool = null;
                                    rightArrowVisible = null;
                                    zSafeUnbox4 = false;
                                }
                                if ((j & 851968) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str23 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        boolean zSafeUnbox11110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = zSafeUnbox11110;
                                        j = j;
                                    } else {
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = false;
                                    }
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str23 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox11111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox11111;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                str21 = str21;
                            }
                            str22 = null;
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox11112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox11112;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11113;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            zSafeUnbox6 = zSafeUnbox6;
                            zSafeUnbox7 = zSafeUnbox7;
                        }
                        str21 = null;
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox11114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox11114;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11115;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11116;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox11117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox11117;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str19 = str19;
                    }
                    str20 = null;
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
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                    } else {
                        str20 = str20;
                        zSafeUnbox6 = false;
                        zSafeUnbox7 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str21 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox11118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox11118;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11119;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111110;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111111;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        zSafeUnbox6 = zSafeUnbox6;
                        zSafeUnbox7 = zSafeUnbox7;
                    }
                    str21 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111112;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111113;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111114;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox111115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox111115;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str18 = str18;
                }
                str19 = null;
                if ((j & 788480) != 0) {
                    if (userActivityViewModel != null) {
                        startTime = userActivityViewModel.getStartTime();
                    } else {
                        startTime = null;
                    }
                    updateRegistration(11, startTime);
                    if (startTime != null) {
                        str20 = startTime.get();
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
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                    } else {
                        str20 = str20;
                        zSafeUnbox6 = false;
                        zSafeUnbox7 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str21 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox111116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox111116;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111117;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111118;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111119;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        zSafeUnbox6 = zSafeUnbox6;
                        zSafeUnbox7 = zSafeUnbox7;
                    }
                    str21 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1111110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1111110;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111112;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1111113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1111113;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str19 = str19;
                }
                str20 = null;
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
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                } else {
                    str20 = str20;
                    zSafeUnbox6 = false;
                    zSafeUnbox7 = false;
                }
                if ((j & 794624) != 0) {
                    if (userActivityViewModel != null) {
                        totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                    } else {
                        totalAscendedValue = null;
                    }
                    updateRegistration(13, totalAscendedValue);
                    if (totalAscendedValue != null) {
                        str21 = totalAscendedValue.get();
                    }
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1111114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1111114;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111115;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111116;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1111117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1111117;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    zSafeUnbox6 = zSafeUnbox6;
                    zSafeUnbox7 = zSafeUnbox7;
                }
                str21 = null;
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str22 = totalDescendedValue.get();
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111118;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1111119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1111119;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str21 = str21;
                }
                str22 = null;
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
                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                } else {
                    str22 = str22;
                    bool = null;
                    rightArrowVisible = null;
                    zSafeUnbox4 = false;
                }
                if ((j & 851968) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str23 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox11111110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox11111110;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str23 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    boolean zSafeUnbox11111111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = zSafeUnbox11111111;
                    j = j;
                } else {
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = false;
                }
            } else {
                str16 = str16;
            }
            str17 = null;
            if ((j & 786944) != 0) {
                if (userActivityViewModel != null) {
                    avgHeartRate = userActivityViewModel.getAvgHeartRate();
                } else {
                    avgHeartRate = null;
                }
                updateRegistration(9, avgHeartRate);
                if (avgHeartRate != null) {
                    str18 = avgHeartRate.get();
                }
                if ((j & 787456) != 0) {
                    if (userActivityViewModel != null) {
                        subtitleField = userActivityViewModel.getSubtitleField();
                    } else {
                        subtitleField = null;
                    }
                    updateRegistration(10, subtitleField);
                    if (subtitleField != null) {
                        str19 = subtitleField.get();
                    }
                    if ((j & 788480) != 0) {
                        if (userActivityViewModel != null) {
                            startTime = userActivityViewModel.getStartTime();
                        } else {
                            startTime = null;
                        }
                        updateRegistration(11, startTime);
                        if (startTime != null) {
                            str20 = startTime.get();
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
                            zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                            zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                        } else {
                            str20 = str20;
                            zSafeUnbox6 = false;
                            zSafeUnbox7 = false;
                        }
                        if ((j & 794624) != 0) {
                            if (userActivityViewModel != null) {
                                totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                            } else {
                                totalAscendedValue = null;
                            }
                            updateRegistration(13, totalAscendedValue);
                            if (totalAscendedValue != null) {
                                str21 = totalAscendedValue.get();
                            }
                            if ((j & 802816) != 0) {
                                if (userActivityViewModel != null) {
                                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                                } else {
                                    totalDescendedValue = null;
                                }
                                updateRegistration(14, totalDescendedValue);
                                if (totalDescendedValue != null) {
                                    str22 = totalDescendedValue.get();
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
                                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                                } else {
                                    str22 = str22;
                                    bool = null;
                                    rightArrowVisible = null;
                                    zSafeUnbox4 = false;
                                }
                                if ((j & 851968) != 0) {
                                    if (userActivityViewModel != null) {
                                        pace = userActivityViewModel.getPace();
                                    } else {
                                        pace = null;
                                    }
                                    updateRegistration(16, pace);
                                    if (pace != null) {
                                        str23 = pace.get();
                                    }
                                    if ((j & 917504) != 0) {
                                        if (userActivityViewModel != null) {
                                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                                        } else {
                                            hasHeartRates = null;
                                        }
                                        updateRegistration(17, hasHeartRates);
                                        boolean zSafeUnbox11111112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = zSafeUnbox11111112;
                                        j = j;
                                    } else {
                                        str5 = str13;
                                        str11 = str14;
                                        str9 = str15;
                                        str4 = str16;
                                        str10 = str17;
                                        str6 = str18;
                                        str12 = str19;
                                        z2 = zSafeUnbox6;
                                        z3 = zSafeUnbox7;
                                        str7 = str21;
                                        str8 = str22;
                                        rightArrowVisible2 = rightArrowVisible;
                                        str = str23;
                                        z4 = zSafeUnbox5;
                                        str3 = str20;
                                        z = false;
                                    }
                                } else {
                                    bool = bool;
                                    rightArrowVisible = rightArrowVisible;
                                }
                                str23 = null;
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox11111113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox11111113;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                str21 = str21;
                            }
                            str22 = null;
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox11111114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox11111114;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11111115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11111115;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            zSafeUnbox6 = zSafeUnbox6;
                            zSafeUnbox7 = zSafeUnbox7;
                        }
                        str21 = null;
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox11111116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox11111116;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11111117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11111117;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11111118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11111118;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox11111119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox11111119;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str19 = str19;
                    }
                    str20 = null;
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
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                    } else {
                        str20 = str20;
                        zSafeUnbox6 = false;
                        zSafeUnbox7 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str21 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox111111110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox111111110;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111111111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111111111;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111111112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111111112;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111111113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111111113;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        zSafeUnbox6 = zSafeUnbox6;
                        zSafeUnbox7 = zSafeUnbox7;
                    }
                    str21 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111111114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111111114;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111111115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111111115;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111111116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111111116;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox111111117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox111111117;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str18 = str18;
                }
                str19 = null;
                if ((j & 788480) != 0) {
                    if (userActivityViewModel != null) {
                        startTime = userActivityViewModel.getStartTime();
                    } else {
                        startTime = null;
                    }
                    updateRegistration(11, startTime);
                    if (startTime != null) {
                        str20 = startTime.get();
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
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                    } else {
                        str20 = str20;
                        zSafeUnbox6 = false;
                        zSafeUnbox7 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str21 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox111111118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox111111118;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111111119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111111119;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1111111110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1111111110;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111111;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        zSafeUnbox6 = zSafeUnbox6;
                        zSafeUnbox7 = zSafeUnbox7;
                    }
                    str21 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1111111112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1111111112;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111113;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111114;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1111111115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1111111115;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str19 = str19;
                }
                str20 = null;
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
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                } else {
                    str20 = str20;
                    zSafeUnbox6 = false;
                    zSafeUnbox7 = false;
                }
                if ((j & 794624) != 0) {
                    if (userActivityViewModel != null) {
                        totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                    } else {
                        totalAscendedValue = null;
                    }
                    updateRegistration(13, totalAscendedValue);
                    if (totalAscendedValue != null) {
                        str21 = totalAscendedValue.get();
                    }
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1111111116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1111111116;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111117;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111118;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1111111119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1111111119;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    zSafeUnbox6 = zSafeUnbox6;
                    zSafeUnbox7 = zSafeUnbox7;
                }
                str21 = null;
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str22 = totalDescendedValue.get();
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox11111111110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox11111111110;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox11111111111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox11111111111;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str21 = str21;
                }
                str22 = null;
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
                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                } else {
                    str22 = str22;
                    bool = null;
                    rightArrowVisible = null;
                    zSafeUnbox4 = false;
                }
                if ((j & 851968) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str23 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox11111111112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox11111111112;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str23 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    boolean zSafeUnbox11111111113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = zSafeUnbox11111111113;
                    j = j;
                } else {
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = false;
                }
            } else {
                str17 = str17;
            }
            str18 = null;
            if ((j & 787456) != 0) {
                if (userActivityViewModel != null) {
                    subtitleField = userActivityViewModel.getSubtitleField();
                } else {
                    subtitleField = null;
                }
                updateRegistration(10, subtitleField);
                if (subtitleField != null) {
                    str19 = subtitleField.get();
                }
                if ((j & 788480) != 0) {
                    if (userActivityViewModel != null) {
                        startTime = userActivityViewModel.getStartTime();
                    } else {
                        startTime = null;
                    }
                    updateRegistration(11, startTime);
                    if (startTime != null) {
                        str20 = startTime.get();
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
                        zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                        zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                    } else {
                        str20 = str20;
                        zSafeUnbox6 = false;
                        zSafeUnbox7 = false;
                    }
                    if ((j & 794624) != 0) {
                        if (userActivityViewModel != null) {
                            totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                        } else {
                            totalAscendedValue = null;
                        }
                        updateRegistration(13, totalAscendedValue);
                        if (totalAscendedValue != null) {
                            str21 = totalAscendedValue.get();
                        }
                        if ((j & 802816) != 0) {
                            if (userActivityViewModel != null) {
                                totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                            } else {
                                totalDescendedValue = null;
                            }
                            updateRegistration(14, totalDescendedValue);
                            if (totalDescendedValue != null) {
                                str22 = totalDescendedValue.get();
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
                                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                            } else {
                                str22 = str22;
                                bool = null;
                                rightArrowVisible = null;
                                zSafeUnbox4 = false;
                            }
                            if ((j & 851968) != 0) {
                                if (userActivityViewModel != null) {
                                    pace = userActivityViewModel.getPace();
                                } else {
                                    pace = null;
                                }
                                updateRegistration(16, pace);
                                if (pace != null) {
                                    str23 = pace.get();
                                }
                                if ((j & 917504) != 0) {
                                    if (userActivityViewModel != null) {
                                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                                    } else {
                                        hasHeartRates = null;
                                    }
                                    updateRegistration(17, hasHeartRates);
                                    boolean zSafeUnbox11111111114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = zSafeUnbox11111111114;
                                    j = j;
                                } else {
                                    str5 = str13;
                                    str11 = str14;
                                    str9 = str15;
                                    str4 = str16;
                                    str10 = str17;
                                    str6 = str18;
                                    str12 = str19;
                                    z2 = zSafeUnbox6;
                                    z3 = zSafeUnbox7;
                                    str7 = str21;
                                    str8 = str22;
                                    rightArrowVisible2 = rightArrowVisible;
                                    str = str23;
                                    z4 = zSafeUnbox5;
                                    str3 = str20;
                                    z = false;
                                }
                            } else {
                                bool = bool;
                                rightArrowVisible = rightArrowVisible;
                            }
                            str23 = null;
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11111111115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11111111115;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            str21 = str21;
                        }
                        str22 = null;
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11111111116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11111111116;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox11111111117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox11111111117;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        zSafeUnbox6 = zSafeUnbox6;
                        zSafeUnbox7 = zSafeUnbox7;
                    }
                    str21 = null;
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox11111111118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox11111111118;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox11111111119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox11111111119;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111111111110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111111111110;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox111111111111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox111111111111;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str19 = str19;
                }
                str20 = null;
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
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                } else {
                    str20 = str20;
                    zSafeUnbox6 = false;
                    zSafeUnbox7 = false;
                }
                if ((j & 794624) != 0) {
                    if (userActivityViewModel != null) {
                        totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                    } else {
                        totalAscendedValue = null;
                    }
                    updateRegistration(13, totalAscendedValue);
                    if (totalAscendedValue != null) {
                        str21 = totalAscendedValue.get();
                    }
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox111111111112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox111111111112;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111111111113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111111111113;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111111111114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111111111114;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox111111111115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox111111111115;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    zSafeUnbox6 = zSafeUnbox6;
                    zSafeUnbox7 = zSafeUnbox7;
                }
                str21 = null;
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str22 = totalDescendedValue.get();
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox111111111116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox111111111116;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox111111111117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox111111111117;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str21 = str21;
                }
                str22 = null;
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
                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                } else {
                    str22 = str22;
                    bool = null;
                    rightArrowVisible = null;
                    zSafeUnbox4 = false;
                }
                if ((j & 851968) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str23 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox111111111118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox111111111118;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str23 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    boolean zSafeUnbox111111111119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = zSafeUnbox111111111119;
                    j = j;
                } else {
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = false;
                }
            } else {
                str18 = str18;
            }
            str19 = null;
            if ((j & 788480) != 0) {
                if (userActivityViewModel != null) {
                    startTime = userActivityViewModel.getStartTime();
                } else {
                    startTime = null;
                }
                updateRegistration(11, startTime);
                if (startTime != null) {
                    str20 = startTime.get();
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
                    zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                    zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
                } else {
                    str20 = str20;
                    zSafeUnbox6 = false;
                    zSafeUnbox7 = false;
                }
                if ((j & 794624) != 0) {
                    if (userActivityViewModel != null) {
                        totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                    } else {
                        totalAscendedValue = null;
                    }
                    updateRegistration(13, totalAscendedValue);
                    if (totalAscendedValue != null) {
                        str21 = totalAscendedValue.get();
                    }
                    if ((j & 802816) != 0) {
                        if (userActivityViewModel != null) {
                            totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                        } else {
                            totalDescendedValue = null;
                        }
                        updateRegistration(14, totalDescendedValue);
                        if (totalDescendedValue != null) {
                            str22 = totalDescendedValue.get();
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
                            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                        } else {
                            str22 = str22;
                            bool = null;
                            rightArrowVisible = null;
                            zSafeUnbox4 = false;
                        }
                        if ((j & 851968) != 0) {
                            if (userActivityViewModel != null) {
                                pace = userActivityViewModel.getPace();
                            } else {
                                pace = null;
                            }
                            updateRegistration(16, pace);
                            if (pace != null) {
                                str23 = pace.get();
                            }
                            if ((j & 917504) != 0) {
                                if (userActivityViewModel != null) {
                                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                                } else {
                                    hasHeartRates = null;
                                }
                                updateRegistration(17, hasHeartRates);
                                boolean zSafeUnbox1111111111110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = zSafeUnbox1111111111110;
                                j = j;
                            } else {
                                str5 = str13;
                                str11 = str14;
                                str9 = str15;
                                str4 = str16;
                                str10 = str17;
                                str6 = str18;
                                str12 = str19;
                                z2 = zSafeUnbox6;
                                z3 = zSafeUnbox7;
                                str7 = str21;
                                str8 = str22;
                                rightArrowVisible2 = rightArrowVisible;
                                str = str23;
                                z4 = zSafeUnbox5;
                                str3 = str20;
                                z = false;
                            }
                        } else {
                            bool = bool;
                            rightArrowVisible = rightArrowVisible;
                        }
                        str23 = null;
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111111111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111111111;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        str21 = str21;
                    }
                    str22 = null;
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111111112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111111112;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1111111111113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1111111111113;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    zSafeUnbox6 = zSafeUnbox6;
                    zSafeUnbox7 = zSafeUnbox7;
                }
                str21 = null;
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str22 = totalDescendedValue.get();
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111111114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111111114;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1111111111115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1111111111115;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str21 = str21;
                }
                str22 = null;
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
                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                } else {
                    str22 = str22;
                    bool = null;
                    rightArrowVisible = null;
                    zSafeUnbox4 = false;
                }
                if ((j & 851968) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str23 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1111111111116 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1111111111116;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str23 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    boolean zSafeUnbox1111111111117 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = zSafeUnbox1111111111117;
                    j = j;
                } else {
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = false;
                }
            } else {
                str19 = str19;
            }
            str20 = null;
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
                zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                zSafeUnbox7 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox6));
            } else {
                str20 = str20;
                zSafeUnbox6 = false;
                zSafeUnbox7 = false;
            }
            if ((j & 794624) != 0) {
                if (userActivityViewModel != null) {
                    totalAscendedValue = userActivityViewModel.getTotalAscendedValue();
                } else {
                    totalAscendedValue = null;
                }
                updateRegistration(13, totalAscendedValue);
                if (totalAscendedValue != null) {
                    str21 = totalAscendedValue.get();
                }
                if ((j & 802816) != 0) {
                    if (userActivityViewModel != null) {
                        totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                    } else {
                        totalDescendedValue = null;
                    }
                    updateRegistration(14, totalDescendedValue);
                    if (totalDescendedValue != null) {
                        str22 = totalDescendedValue.get();
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
                        zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                    } else {
                        str22 = str22;
                        bool = null;
                        rightArrowVisible = null;
                        zSafeUnbox4 = false;
                    }
                    if ((j & 851968) != 0) {
                        if (userActivityViewModel != null) {
                            pace = userActivityViewModel.getPace();
                        } else {
                            pace = null;
                        }
                        updateRegistration(16, pace);
                        if (pace != null) {
                            str23 = pace.get();
                        }
                        if ((j & 917504) != 0) {
                            if (userActivityViewModel != null) {
                                hasHeartRates = userActivityViewModel.getHasHeartRates();
                            } else {
                                hasHeartRates = null;
                            }
                            updateRegistration(17, hasHeartRates);
                            boolean zSafeUnbox1111111111118 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = zSafeUnbox1111111111118;
                            j = j;
                        } else {
                            str5 = str13;
                            str11 = str14;
                            str9 = str15;
                            str4 = str16;
                            str10 = str17;
                            str6 = str18;
                            str12 = str19;
                            z2 = zSafeUnbox6;
                            z3 = zSafeUnbox7;
                            str7 = str21;
                            str8 = str22;
                            rightArrowVisible2 = rightArrowVisible;
                            str = str23;
                            z4 = zSafeUnbox5;
                            str3 = str20;
                            z = false;
                        }
                    } else {
                        bool = bool;
                        rightArrowVisible = rightArrowVisible;
                    }
                    str23 = null;
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox1111111111119 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox1111111111119;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    str21 = str21;
                }
                str22 = null;
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
                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                } else {
                    str22 = str22;
                    bool = null;
                    rightArrowVisible = null;
                    zSafeUnbox4 = false;
                }
                if ((j & 851968) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str23 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox11111111111110 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox11111111111110;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str23 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    boolean zSafeUnbox11111111111111 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = zSafeUnbox11111111111111;
                    j = j;
                } else {
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = false;
                }
            } else {
                zSafeUnbox6 = zSafeUnbox6;
                zSafeUnbox7 = zSafeUnbox7;
            }
            str21 = null;
            if ((j & 802816) != 0) {
                if (userActivityViewModel != null) {
                    totalDescendedValue = userActivityViewModel.getTotalDescendedValue();
                } else {
                    totalDescendedValue = null;
                }
                updateRegistration(14, totalDescendedValue);
                if (totalDescendedValue != null) {
                    str22 = totalDescendedValue.get();
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
                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                } else {
                    str22 = str22;
                    bool = null;
                    rightArrowVisible = null;
                    zSafeUnbox4 = false;
                }
                if ((j & 851968) != 0) {
                    if (userActivityViewModel != null) {
                        pace = userActivityViewModel.getPace();
                    } else {
                        pace = null;
                    }
                    updateRegistration(16, pace);
                    if (pace != null) {
                        str23 = pace.get();
                    }
                    if ((j & 917504) != 0) {
                        if (userActivityViewModel != null) {
                            hasHeartRates = userActivityViewModel.getHasHeartRates();
                        } else {
                            hasHeartRates = null;
                        }
                        updateRegistration(17, hasHeartRates);
                        boolean zSafeUnbox11111111111112 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = zSafeUnbox11111111111112;
                        j = j;
                    } else {
                        str5 = str13;
                        str11 = str14;
                        str9 = str15;
                        str4 = str16;
                        str10 = str17;
                        str6 = str18;
                        str12 = str19;
                        z2 = zSafeUnbox6;
                        z3 = zSafeUnbox7;
                        str7 = str21;
                        str8 = str22;
                        rightArrowVisible2 = rightArrowVisible;
                        str = str23;
                        z4 = zSafeUnbox5;
                        str3 = str20;
                        z = false;
                    }
                } else {
                    bool = bool;
                    rightArrowVisible = rightArrowVisible;
                }
                str23 = null;
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    boolean zSafeUnbox11111111111113 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = zSafeUnbox11111111111113;
                    j = j;
                } else {
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = false;
                }
            } else {
                str21 = str21;
            }
            str22 = null;
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
                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
            } else {
                str22 = str22;
                bool = null;
                rightArrowVisible = null;
                zSafeUnbox4 = false;
            }
            if ((j & 851968) != 0) {
                if (userActivityViewModel != null) {
                    pace = userActivityViewModel.getPace();
                } else {
                    pace = null;
                }
                updateRegistration(16, pace);
                if (pace != null) {
                    str23 = pace.get();
                }
                if ((j & 917504) != 0) {
                    if (userActivityViewModel != null) {
                        hasHeartRates = userActivityViewModel.getHasHeartRates();
                    } else {
                        hasHeartRates = null;
                    }
                    updateRegistration(17, hasHeartRates);
                    boolean zSafeUnbox11111111111114 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = zSafeUnbox11111111111114;
                    j = j;
                } else {
                    str5 = str13;
                    str11 = str14;
                    str9 = str15;
                    str4 = str16;
                    str10 = str17;
                    str6 = str18;
                    str12 = str19;
                    z2 = zSafeUnbox6;
                    z3 = zSafeUnbox7;
                    str7 = str21;
                    str8 = str22;
                    rightArrowVisible2 = rightArrowVisible;
                    str = str23;
                    z4 = zSafeUnbox5;
                    str3 = str20;
                    z = false;
                }
            } else {
                bool = bool;
                rightArrowVisible = rightArrowVisible;
            }
            str23 = null;
            if ((j & 917504) != 0) {
                if (userActivityViewModel != null) {
                    hasHeartRates = userActivityViewModel.getHasHeartRates();
                } else {
                    hasHeartRates = null;
                }
                updateRegistration(17, hasHeartRates);
                boolean zSafeUnbox11111111111115 = androidx.databinding.ViewDataBinding.safeUnbox(hasHeartRates != null ? hasHeartRates.get() : null);
                str5 = str13;
                str11 = str14;
                str9 = str15;
                str4 = str16;
                str10 = str17;
                str6 = str18;
                str12 = str19;
                z2 = zSafeUnbox6;
                z3 = zSafeUnbox7;
                str7 = str21;
                str8 = str22;
                rightArrowVisible2 = rightArrowVisible;
                str = str23;
                z4 = zSafeUnbox5;
                str3 = str20;
                z = zSafeUnbox11111111111115;
                j = j;
            } else {
                str5 = str13;
                str11 = str14;
                str9 = str15;
                str4 = str16;
                str10 = str17;
                str6 = str18;
                str12 = str19;
                z2 = zSafeUnbox6;
                z3 = zSafeUnbox7;
                str7 = str21;
                str8 = str22;
                rightArrowVisible2 = rightArrowVisible;
                str = str23;
                z4 = zSafeUnbox5;
                str3 = str20;
                z = false;
            }
        } else {
            value = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            value2 = null;
            bool = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            str12 = null;
            z = false;
            z2 = false;
            z3 = false;
            zSafeUnbox = false;
            zSafeUnbox2 = false;
            zSafeUnbox3 = false;
            z4 = false;
            zSafeUnbox4 = false;
        }
        if ((j & android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) != 0) {
            if (userActivityViewModel != null) {
                rightArrowVisible2 = userActivityViewModel.getRightArrowVisible();
            }
            androidx.databinding.ObservableField<java.lang.Boolean> observableField = rightArrowVisible2;
            updateRegistration(15, observableField);
            if (observableField != null) {
                bool = observableField.get();
            }
            zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
        }
        boolean z6 = zSafeUnbox4;
        long j3 = j & 819232;
        if (j3 != 0) {
            z5 = zSafeUnbox2 ? true : z6;
        } else {
            z5 = false;
        }
        boolean z7 = zSafeUnbox;
        if ((j & 786436) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.activityName, str2);
        }
        if (j3 != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.centerHorizontalInRelative(this.activityName, z5);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.centerHorizontalInRelative(this.subtitleLabel, z5);
        }
        if ((j & 917504) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.chartFragmentContainer, z);
        }
        if ((j & 790528) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mapsFragmentContainer, z2);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView21, z3);
        }
        if ((j & 786432) != 0) {
            this.mboundView1.setOnClickListener(value);
            this.mboundView4.setOnClickListener(value2);
        }
        if ((786464 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView1, zSafeUnbox2);
        }
        if ((j & 851968) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, str);
        }
        if ((j & 786560) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, str4);
        }
        if ((788480 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, str3);
        }
        if ((j & 786496) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView13, z7);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView15, z7);
            boolean z8 = zSafeUnbox3;
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView7, z8);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView9, z8);
        }
        if ((j & 786433) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, str5);
        }
        if ((786944 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView16, str6);
        }
        if ((j & 786440) != 0) {
            boolean z9 = z4;
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView17, z9);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView19, z9);
        }
        if ((794624 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, str7);
        }
        if ((802816 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView20, str8);
        }
        if ((819200 & j) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView4, z6);
        }
        if ((j & 786448) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, str9);
        }
        if ((786688 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, str10);
        }
        if ((j & 786434) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, str11);
        }
        if ((j & 787456) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtitleLabel, str12);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel value) {
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

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentUserActivityBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.UserActivityViewModel value) {
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
