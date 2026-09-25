package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentWatchSettingsBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl mViewModelOnAlarmClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl13 mViewModelOnAlertClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl5 mViewModelOnBLEAlertClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl10 mViewModelOnBackLightDurationClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl6 mViewModelOnBackLightModeClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl11 mViewModelOnClockClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl4 mViewModelOnDNDClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl3 mViewModelOnGPSUpdateClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl9 mViewModelOnHomeScreenClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl12 mViewModelOnLanguageClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl2 mViewModelOnPopUpDurationClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl8 mViewModelOnRingtoneClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl7 mViewModelOnTimerClickedAndroidViewViewOnClickListener;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl1 mViewModelOnUnitsClickedAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.RelativeLayout mboundView1;
    private final android.widget.RelativeLayout mboundView10;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView11;
    private final android.widget.RelativeLayout mboundView12;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView13;
    private final android.widget.RelativeLayout mboundView14;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView15;
    private final android.widget.RelativeLayout mboundView16;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView17;
    private final android.widget.RelativeLayout mboundView18;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView19;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView2;
    private final android.widget.RelativeLayout mboundView20;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView21;
    private final android.widget.RelativeLayout mboundView22;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView23;
    private final android.widget.RelativeLayout mboundView24;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView25;
    private final android.widget.RelativeLayout mboundView26;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView27;
    private final android.widget.TextView mboundView28;
    private final android.widget.TextView mboundView29;
    private final android.widget.RelativeLayout mboundView3;
    private final android.widget.RelativeLayout mboundView30;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView4;
    private final android.widget.RelativeLayout mboundView5;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView6;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView7;
    private final android.widget.RelativeLayout mboundView8;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView9;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_clock, 31);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_units, 32);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_language, 33);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_dnd, 34);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_backlight, 35);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_backlight_duration, 36);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_popup_duration, 37);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_gps, 38);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_home_screen, 39);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_ble_alert, 40);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_ringtone_alert, 41);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_alert_set, 42);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_alarm_set, 43);
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.arrow_timer_set, 44);
    }

    public FragmentWatchSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 45, sIncludes, sViewsWithIds));
    }

    private FragmentWatchSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 14, (android.widget.ImageView) bindings[43], (android.widget.ImageView) bindings[42], (android.widget.ImageView) bindings[35], (android.widget.ImageView) bindings[36], (android.widget.ImageView) bindings[40], (android.widget.ImageView) bindings[31], (android.widget.ImageView) bindings[34], (android.widget.ImageView) bindings[38], (android.widget.ImageView) bindings[39], (android.widget.ImageView) bindings[33], (android.widget.ImageView) bindings[37], (android.widget.ImageView) bindings[41], (android.widget.ImageView) bindings[44], (android.widget.ImageView) bindings[32]);
        this.mDirtyFlags = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1 = relativeLayout;
        relativeLayout.setTag(null);
        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) bindings[10];
        this.mboundView10 = relativeLayout2;
        relativeLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[11];
        this.mboundView11 = fontableTextView;
        fontableTextView.setTag(null);
        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) bindings[12];
        this.mboundView12 = relativeLayout3;
        relativeLayout3.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView2 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[13];
        this.mboundView13 = fontableTextView2;
        fontableTextView2.setTag(null);
        android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) bindings[14];
        this.mboundView14 = relativeLayout4;
        relativeLayout4.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView3 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[15];
        this.mboundView15 = fontableTextView3;
        fontableTextView3.setTag(null);
        android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) bindings[16];
        this.mboundView16 = relativeLayout5;
        relativeLayout5.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView4 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[17];
        this.mboundView17 = fontableTextView4;
        fontableTextView4.setTag(null);
        android.widget.RelativeLayout relativeLayout6 = (android.widget.RelativeLayout) bindings[18];
        this.mboundView18 = relativeLayout6;
        relativeLayout6.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView5 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[19];
        this.mboundView19 = fontableTextView5;
        fontableTextView5.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView6 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[2];
        this.mboundView2 = fontableTextView6;
        fontableTextView6.setTag(null);
        android.widget.RelativeLayout relativeLayout7 = (android.widget.RelativeLayout) bindings[20];
        this.mboundView20 = relativeLayout7;
        relativeLayout7.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView7 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[21];
        this.mboundView21 = fontableTextView7;
        fontableTextView7.setTag(null);
        android.widget.RelativeLayout relativeLayout8 = (android.widget.RelativeLayout) bindings[22];
        this.mboundView22 = relativeLayout8;
        relativeLayout8.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView8 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[23];
        this.mboundView23 = fontableTextView8;
        fontableTextView8.setTag(null);
        android.widget.RelativeLayout relativeLayout9 = (android.widget.RelativeLayout) bindings[24];
        this.mboundView24 = relativeLayout9;
        relativeLayout9.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView9 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[25];
        this.mboundView25 = fontableTextView9;
        fontableTextView9.setTag(null);
        android.widget.RelativeLayout relativeLayout10 = (android.widget.RelativeLayout) bindings[26];
        this.mboundView26 = relativeLayout10;
        relativeLayout10.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView10 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[27];
        this.mboundView27 = fontableTextView10;
        fontableTextView10.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) bindings[28];
        this.mboundView28 = textView;
        textView.setTag(null);
        android.widget.TextView textView2 = (android.widget.TextView) bindings[29];
        this.mboundView29 = textView2;
        textView2.setTag(null);
        android.widget.RelativeLayout relativeLayout11 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3 = relativeLayout11;
        relativeLayout11.setTag(null);
        android.widget.RelativeLayout relativeLayout12 = (android.widget.RelativeLayout) bindings[30];
        this.mboundView30 = relativeLayout12;
        relativeLayout12.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView11 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[4];
        this.mboundView4 = fontableTextView11;
        fontableTextView11.setTag(null);
        android.widget.RelativeLayout relativeLayout13 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5 = relativeLayout13;
        relativeLayout13.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView12 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[6];
        this.mboundView6 = fontableTextView12;
        fontableTextView12.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView13 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[7];
        this.mboundView7 = fontableTextView13;
        fontableTextView13.setTag(null);
        android.widget.RelativeLayout relativeLayout14 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8 = relativeLayout14;
        relativeLayout14.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView14 = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[9];
        this.mboundView9 = fontableTextView14;
        fontableTextView14.setTag(null);
        setRootTag(root);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM ViewModel) {
        this.mViewModel = ViewModel;
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, java.lang.Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return onChangeViewModelBackLightModeField((androidx.databinding.ObservableField) object, fieldId);
            case 1:
                return onChangeViewModelLanguageField((androidx.databinding.ObservableField) object, fieldId);
            case 2:
                return onChangeViewModelAlertModeField((androidx.databinding.ObservableField) object, fieldId);
            case 3:
                return onChangeViewModelClockField((androidx.databinding.ObservableField) object, fieldId);
            case 4:
                return onChangeViewModelBleDisconnectionField((androidx.databinding.ObservableField) object, fieldId);
            case 5:
                return onChangeViewModelAlarmField((androidx.databinding.ObservableField) object, fieldId);
            case 6:
                return onChangeViewModelPopUpDurationField((androidx.databinding.ObservableField) object, fieldId);
            case 7:
                return onChangeViewModelRingtoneField((androidx.databinding.ObservableField) object, fieldId);
            case 8:
                return onChangeViewModelDndField((androidx.databinding.ObservableField) object, fieldId);
            case 9:
                return onChangeViewModelWatchOnlySectionTitle((androidx.databinding.ObservableField) object, fieldId);
            case 10:
                return onChangeViewModelUnitsField((androidx.databinding.ObservableField) object, fieldId);
            case 11:
                return onChangeViewModelHomeScreenModeField((androidx.databinding.ObservableField) object, fieldId);
            case 12:
                return onChangeViewModelBackLightDurationField((androidx.databinding.ObservableField) object, fieldId);
            case 13:
                return onChangeViewModelGpsUpdateField((androidx.databinding.ObservableField) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeViewModelBackLightModeField(androidx.databinding.ObservableField<java.lang.String> ViewModelBackLightModeField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelLanguageField(androidx.databinding.ObservableField<java.lang.String> ViewModelLanguageField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelAlertModeField(androidx.databinding.ObservableField<java.lang.String> ViewModelAlertModeField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelClockField(androidx.databinding.ObservableField<java.lang.String> ViewModelClockField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelBleDisconnectionField(androidx.databinding.ObservableField<java.lang.String> ViewModelBleDisconnectionField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelAlarmField(androidx.databinding.ObservableField<java.lang.String> ViewModelAlarmField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelPopUpDurationField(androidx.databinding.ObservableField<java.lang.String> ViewModelPopUpDurationField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeViewModelRingtoneField(androidx.databinding.ObservableField<java.lang.String> ViewModelRingtoneField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeViewModelDndField(androidx.databinding.ObservableField<java.lang.String> ViewModelDndField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeViewModelWatchOnlySectionTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelWatchOnlySectionTitle, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    private boolean onChangeViewModelUnitsField(androidx.databinding.ObservableField<java.lang.String> ViewModelUnitsField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return true;
    }

    private boolean onChangeViewModelHomeScreenModeField(androidx.databinding.ObservableField<java.lang.String> ViewModelHomeScreenModeField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    private boolean onChangeViewModelBackLightDurationField(androidx.databinding.ObservableField<java.lang.String> ViewModelBackLightDurationField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        return true;
    }

    private boolean onChangeViewModelGpsUpdateField(androidx.databinding.ObservableField<java.lang.String> ViewModelGpsUpdateField, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:107:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x020b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0212  */
    /* JADX WARN: Code duplicated, block: B:112:0x021c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0223  */
    /* JADX WARN: Code duplicated, block: B:117:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0231  */
    /* JADX WARN: Code duplicated, block: B:119:0x0238  */
    /* JADX WARN: Code duplicated, block: B:122:0x0242  */
    /* JADX WARN: Code duplicated, block: B:123:0x0249  */
    /* JADX WARN: Code duplicated, block: B:127:0x0258 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x025a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0261  */
    /* JADX WARN: Code duplicated, block: B:132:0x026b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0272  */
    /* JADX WARN: Code duplicated, block: B:137:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0283  */
    /* JADX WARN: Code duplicated, block: B:139:0x028a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0295  */
    /* JADX WARN: Code duplicated, block: B:143:0x029c  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:152:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02de  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x02fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0305  */
    /* JADX WARN: Code duplicated, block: B:172:0x0310  */
    /* JADX WARN: Code duplicated, block: B:173:0x0317  */
    /* JADX WARN: Code duplicated, block: B:177:0x0323 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0325  */
    /* JADX WARN: Code duplicated, block: B:179:0x032c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0337  */
    /* JADX WARN: Code duplicated, block: B:183:0x033e  */
    /* JADX WARN: Code duplicated, block: B:187:0x034a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x034c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0351  */
    /* JADX WARN: Code duplicated, block: B:192:0x035a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x017a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0184  */
    /* JADX WARN: Code duplicated, block: B:77:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ec  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:192:0x035a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        /*
            Method dump skipped, instruction units count: 1241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.executeBindings():void");
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onAlarmClicked(arg0);
        }
    }

    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl1 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onUnitsClicked(arg0);
        }
    }

    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl2 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onPopUpDurationClicked(arg0);
        }
    }

    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl3 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onGPSUpdateClicked(arg0);
        }
    }

    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl4 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onDNDClicked(arg0);
        }
    }

    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl5 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onBLEAlertClicked(arg0);
        }
    }

    public static class OnClickListenerImpl6 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl6 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onBackLightModeClicked(arg0);
        }
    }

    public static class OnClickListenerImpl7 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl7 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onTimerClicked(arg0);
        }
    }

    public static class OnClickListenerImpl8 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl8 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onRingtoneClicked(arg0);
        }
    }

    public static class OnClickListenerImpl9 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl9 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onHomeScreenClicked(arg0);
        }
    }

    public static class OnClickListenerImpl10 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl10 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onBackLightDurationClicked(arg0);
        }
    }

    public static class OnClickListenerImpl11 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl11 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onClockClicked(arg0);
        }
    }

    public static class OnClickListenerImpl12 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl12 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
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

    public static class OnClickListenerImpl13 implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentWatchSettingsBindingImpl.OnClickListenerImpl13 setValue(powerwatch.matrix.com.pwgen2android.main.watch.settings.WatchSettingsVM value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.onAlertClicked(arg0);
        }
    }
}
