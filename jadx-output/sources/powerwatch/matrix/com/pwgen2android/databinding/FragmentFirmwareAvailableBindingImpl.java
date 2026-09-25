package powerwatch.matrix.com.pwgen2android.databinding;

/* JADX INFO: loaded from: classes2.dex */
public class FragmentFirmwareAvailableBindingImpl extends powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding {
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final android.util.SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBindingImpl.OnClickListenerImpl mViewModelStartUpdateAndroidViewViewOnClickListener;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.TextView mboundView1;
    private final android.widget.TextView mboundView10;
    private final android.widget.LinearLayout mboundView11;
    private final powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView mboundView12;
    private final android.widget.TextView mboundView2;
    private final android.widget.TextView mboundView3;
    private final android.widget.TextView mboundView4;
    private final android.widget.TextView mboundView5;
    private final android.widget.Button mboundView7;
    private final android.widget.LinearLayout mboundView8;
    private final android.widget.TextView mboundView9;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(powerwatch.matrix.com.pwgen2android.R.id.progressBar, 13);
    }

    public FragmentFirmwareAvailableBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }

    private FragmentFirmwareAvailableBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, android.view.View root, java.lang.Object[] bindings) {
        super(bindingComponent, root, 14, (android.widget.LinearLayout) bindings[6], (android.widget.ProgressBar) bindings[13]);
        this.mDirtyFlags = -1L;
        this.actionLayout.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) bindings[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) bindings[1];
        this.mboundView1 = textView;
        textView.setTag(null);
        android.widget.TextView textView2 = (android.widget.TextView) bindings[10];
        this.mboundView10 = textView2;
        textView2.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11 = linearLayout2;
        linearLayout2.setTag(null);
        powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView fontableTextView = (powerwatch.matrix.com.pwgen2android.shared.ui.views.FontableTextView) bindings[12];
        this.mboundView12 = fontableTextView;
        fontableTextView.setTag(null);
        android.widget.TextView textView3 = (android.widget.TextView) bindings[2];
        this.mboundView2 = textView3;
        textView3.setTag(null);
        android.widget.TextView textView4 = (android.widget.TextView) bindings[3];
        this.mboundView3 = textView4;
        textView4.setTag(null);
        android.widget.TextView textView5 = (android.widget.TextView) bindings[4];
        this.mboundView4 = textView5;
        textView5.setTag(null);
        android.widget.TextView textView6 = (android.widget.TextView) bindings[5];
        this.mboundView5 = textView6;
        textView6.setTag(null);
        android.widget.Button button = (android.widget.Button) bindings[7];
        this.mboundView7 = button;
        button.setTag(null);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8 = linearLayout3;
        linearLayout3.setTag(null);
        android.widget.TextView textView7 = (android.widget.TextView) bindings[9];
        this.mboundView9 = textView7;
        textView7.setTag(null);
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
        setViewModel((powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel) variable);
        return true;
    }

    @Override // powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBinding
    public void setViewModel(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel ViewModel) {
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
                return onChangeViewModelUpdateInfo((androidx.databinding.ObservableField) object, fieldId);
            case 1:
                return onChangeViewModelUpdatePreconditionsErrorText((androidx.databinding.ObservableField) object, fieldId);
            case 2:
                return onChangeViewModelReleaseNotes((androidx.databinding.ObservableField) object, fieldId);
            case 3:
                return onChangeViewModelOtaFailed((androidx.databinding.ObservableField) object, fieldId);
            case 4:
                return onChangeViewModelUpdatePhaseText((androidx.databinding.ObservableField) object, fieldId);
            case 5:
                return onChangeViewModelOtaInProgress((androidx.databinding.ObservableField) object, fieldId);
            case 6:
                return onChangeViewModelReleaseInfo((androidx.databinding.ObservableField) object, fieldId);
            case 7:
                return onChangeViewModelUpdateButtonText((androidx.databinding.ObservableField) object, fieldId);
            case 8:
                return onChangeViewModelUpdateButtonEnabled((androidx.databinding.ObservableField) object, fieldId);
            case 9:
                return onChangeViewModelUpdateFailedReason((androidx.databinding.ObservableField) object, fieldId);
            case 10:
                return onChangeViewModelUpdateAvailable((androidx.databinding.ObservableField) object, fieldId);
            case 11:
                return onChangeViewModelDisplayPreconditionsError((androidx.databinding.ObservableField) object, fieldId);
            case 12:
                return onChangeViewModelFirmwareVersion((androidx.databinding.ObservableField) object, fieldId);
            case 13:
                return onChangeViewModelOtaStatus((androidx.databinding.ObservableField) object, fieldId);
            default:
                return false;
        }
    }

    private boolean onChangeViewModelUpdateInfo(androidx.databinding.ObservableField<java.lang.String> ViewModelUpdateInfo, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        return true;
    }

    private boolean onChangeViewModelUpdatePreconditionsErrorText(androidx.databinding.ObservableField<java.lang.String> ViewModelUpdatePreconditionsErrorText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        return true;
    }

    private boolean onChangeViewModelReleaseNotes(androidx.databinding.ObservableField<java.lang.String> ViewModelReleaseNotes, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        return true;
    }

    private boolean onChangeViewModelOtaFailed(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelOtaFailed, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        return true;
    }

    private boolean onChangeViewModelUpdatePhaseText(androidx.databinding.ObservableField<java.lang.String> ViewModelUpdatePhaseText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        return true;
    }

    private boolean onChangeViewModelOtaInProgress(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelOtaInProgress, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        return true;
    }

    private boolean onChangeViewModelReleaseInfo(androidx.databinding.ObservableField<java.lang.String> ViewModelReleaseInfo, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 64;
        }
        return true;
    }

    private boolean onChangeViewModelUpdateButtonText(androidx.databinding.ObservableField<java.lang.String> ViewModelUpdateButtonText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 128;
        }
        return true;
    }

    private boolean onChangeViewModelUpdateButtonEnabled(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelUpdateButtonEnabled, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 256;
        }
        return true;
    }

    private boolean onChangeViewModelUpdateFailedReason(androidx.databinding.ObservableField<java.lang.String> ViewModelUpdateFailedReason, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= 512;
        }
        return true;
    }

    private boolean onChangeViewModelUpdateAvailable(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelUpdateAvailable, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        return true;
    }

    private boolean onChangeViewModelDisplayPreconditionsError(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelDisplayPreconditionsError, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH;
        }
        return true;
    }

    private boolean onChangeViewModelFirmwareVersion(androidx.databinding.ObservableField<java.lang.String> ViewModelFirmwareVersion, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        return true;
    }

    private boolean onChangeViewModelOtaStatus(androidx.databinding.ObservableField<java.lang.String> ViewModelOtaStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.mDirtyFlags |= android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:132:0x0203  */
    /* JADX WARN: Code duplicated, block: B:135:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0210  */
    /* JADX WARN: Code duplicated, block: B:137:0x0217  */
    /* JADX WARN: Code duplicated, block: B:140:0x0221  */
    /* JADX WARN: Code duplicated, block: B:141:0x0228  */
    /* JADX WARN: Code duplicated, block: B:143:0x022e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x023b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0242  */
    /* JADX WARN: Code duplicated, block: B:151:0x024c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0253  */
    /* JADX WARN: Code duplicated, block: B:156:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0263  */
    /* JADX WARN: Code duplicated, block: B:158:0x0268  */
    /* JADX WARN: Code duplicated, block: B:161:0x0270  */
    /* JADX WARN: Code duplicated, block: B:162:0x028f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112  */
    /* JADX WARN: Code duplicated, block: B:83:0x0130  */
    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        boolean z;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        boolean zSafeUnbox;
        java.lang.String str5;
        boolean z2;
        android.graphics.drawable.Drawable drawable;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBindingImpl.OnClickListenerImpl onClickListenerImpl;
        java.lang.String str6;
        java.lang.String str7;
        boolean z3;
        boolean z4;
        boolean z5;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        boolean zSafeUnbox2;
        boolean zSafeUnbox3;
        java.lang.String str12;
        java.lang.String str13;
        powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBindingImpl.OnClickListenerImpl value;
        android.graphics.drawable.Drawable drawable2;
        java.lang.String str14;
        boolean zSafeUnbox4;
        boolean zSafeUnbox5;
        java.lang.String str15;
        androidx.databinding.ObservableField<java.lang.String> otaStatus;
        androidx.databinding.ObservableField<java.lang.String> firmwareVersion;
        androidx.databinding.ObservableField<java.lang.Boolean> displayPreconditionsError;
        java.lang.Boolean bool;
        androidx.databinding.ObservableField<java.lang.Boolean> updateAvailable;
        java.lang.Boolean bool2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel firmwareAvailableViewModel = this.mViewModel;
        if ((65535 & j) != 0) {
            if ((j & 49153) == 0) {
                str3 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> updateInfo = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getUpdateInfo() : null;
                updateRegistration(0, updateInfo);
                if (updateInfo != null) {
                    str3 = updateInfo.get();
                } else {
                    str3 = null;
                }
            }
            if ((j & 49154) == 0) {
                str4 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> updatePreconditionsErrorText = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getUpdatePreconditionsErrorText() : null;
                updateRegistration(1, updatePreconditionsErrorText);
                if (updatePreconditionsErrorText != null) {
                    str4 = updatePreconditionsErrorText.get();
                } else {
                    str4 = null;
                }
            }
            if ((j & 49156) == 0) {
                str10 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> releaseNotes = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getReleaseNotes() : null;
                updateRegistration(2, releaseNotes);
                if (releaseNotes != null) {
                    str10 = releaseNotes.get();
                } else {
                    str10 = null;
                }
            }
            if ((j & 49160) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> otaFailed = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getOtaFailed() : null;
                updateRegistration(3, otaFailed);
                zSafeUnbox = androidx.databinding.ViewDataBinding.safeUnbox(otaFailed != null ? otaFailed.get() : null);
            } else {
                zSafeUnbox = false;
            }
            if ((j & 49168) == 0) {
                str11 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> updatePhaseText = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getUpdatePhaseText() : null;
                updateRegistration(4, updatePhaseText);
                if (updatePhaseText != null) {
                    str11 = updatePhaseText.get();
                } else {
                    str11 = null;
                }
            }
            if ((j & 49184) != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> otaInProgress = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getOtaInProgress() : null;
                updateRegistration(5, otaInProgress);
                zSafeUnbox2 = androidx.databinding.ViewDataBinding.safeUnbox(otaInProgress != null ? otaInProgress.get() : null);
                zSafeUnbox3 = androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.valueOf(!zSafeUnbox2));
            } else {
                zSafeUnbox2 = false;
                zSafeUnbox3 = false;
            }
            if ((j & 49216) == 0) {
                str12 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> releaseInfo = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getReleaseInfo() : null;
                updateRegistration(6, releaseInfo);
                if (releaseInfo != null) {
                    str12 = releaseInfo.get();
                } else {
                    str12 = null;
                }
            }
            if ((j & 49280) == 0) {
                str13 = null;
            } else {
                androidx.databinding.ObservableField<java.lang.String> updateButtonText = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getUpdateButtonText() : null;
                updateRegistration(7, updateButtonText);
                if (updateButtonText != null) {
                    str13 = updateButtonText.get();
                } else {
                    str13 = null;
                }
            }
            if ((j & 49152) == 0 || firmwareAvailableViewModel == null) {
                value = null;
            } else {
                powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBindingImpl.OnClickListenerImpl onClickListenerImpl2 = this.mViewModelStartUpdateAndroidViewViewOnClickListener;
                if (onClickListenerImpl2 == null) {
                    onClickListenerImpl2 = new powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBindingImpl.OnClickListenerImpl();
                    this.mViewModelStartUpdateAndroidViewViewOnClickListener = onClickListenerImpl2;
                }
                value = onClickListenerImpl2.setValue(firmwareAvailableViewModel);
            }
            long j2 = j & 49408;
            if (j2 != 0) {
                androidx.databinding.ObservableField<java.lang.Boolean> updateButtonEnabled = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getUpdateButtonEnabled() : null;
                updateRegistration(8, updateButtonEnabled);
                boolean zSafeUnbox6 = androidx.databinding.ViewDataBinding.safeUnbox(updateButtonEnabled != null ? updateButtonEnabled.get() : null);
                if (j2 != 0) {
                    j |= zSafeUnbox6 ? android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_URI : android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                }
                z3 = zSafeUnbox6;
                drawable2 = zSafeUnbox6 ? androidx.appcompat.content.res.AppCompatResources.getDrawable(this.mboundView7.getContext(), powerwatch.matrix.com.pwgen2android.R.drawable.rounded_red_button_background) : androidx.appcompat.content.res.AppCompatResources.getDrawable(this.mboundView7.getContext(), powerwatch.matrix.com.pwgen2android.R.drawable.rounded_disabled_transparent_button);
                j = j;
            } else {
                drawable2 = null;
                z3 = false;
            }
            if ((j & 49664) != 0) {
                androidx.databinding.ObservableField<java.lang.String> updateFailedReason = firmwareAvailableViewModel != null ? firmwareAvailableViewModel.getUpdateFailedReason() : null;
                updateRegistration(9, updateFailedReason);
                str14 = updateFailedReason != null ? updateFailedReason.get() : null;
                if ((j & 50176) != 0) {
                    if (firmwareAvailableViewModel != null) {
                        updateAvailable = firmwareAvailableViewModel.getUpdateAvailable();
                    } else {
                        updateAvailable = null;
                    }
                    updateRegistration(10, updateAvailable);
                    if (updateAvailable != null) {
                        bool2 = updateAvailable.get();
                    } else {
                        bool2 = null;
                    }
                    zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
                } else {
                    str14 = str14;
                    zSafeUnbox4 = false;
                }
                if ((j & 51200) != 0) {
                    if (firmwareAvailableViewModel != null) {
                        displayPreconditionsError = firmwareAvailableViewModel.getDisplayPreconditionsError();
                    } else {
                        displayPreconditionsError = null;
                    }
                    updateRegistration(11, displayPreconditionsError);
                    if (displayPreconditionsError != null) {
                        bool = displayPreconditionsError.get();
                    } else {
                        bool = null;
                    }
                    zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
                } else {
                    zSafeUnbox4 = zSafeUnbox4;
                    zSafeUnbox5 = false;
                }
                if ((j & 53248) != 0) {
                    if (firmwareAvailableViewModel != null) {
                        firmwareVersion = firmwareAvailableViewModel.getFirmwareVersion();
                    } else {
                        firmwareVersion = null;
                    }
                    updateRegistration(12, firmwareVersion);
                    str15 = firmwareVersion != null ? firmwareVersion.get() : null;
                    if ((j & 57344) == 0) {
                        str2 = str15;
                        str9 = str11;
                        z5 = zSafeUnbox3;
                        onClickListenerImpl = value;
                        z = zSafeUnbox5;
                        str5 = str12;
                        str8 = str13;
                        str = str14;
                        str6 = str10;
                        z4 = zSafeUnbox2;
                        drawable = drawable2;
                        z2 = zSafeUnbox4;
                        str7 = null;
                    } else {
                        if (firmwareAvailableViewModel != null) {
                            otaStatus = firmwareAvailableViewModel.getOtaStatus();
                        } else {
                            otaStatus = null;
                        }
                        updateRegistration(13, otaStatus);
                        if (otaStatus != null) {
                            str2 = str15;
                            str9 = str11;
                            z5 = zSafeUnbox3;
                            onClickListenerImpl = value;
                            str5 = str12;
                            str8 = str13;
                            str = str14;
                            str6 = str10;
                            z2 = zSafeUnbox4;
                            android.graphics.drawable.Drawable drawable3 = drawable2;
                            str7 = otaStatus.get();
                            z = zSafeUnbox5;
                            z4 = zSafeUnbox2;
                            drawable = drawable3;
                        } else {
                            str2 = str15;
                            str9 = str11;
                            z5 = zSafeUnbox3;
                            onClickListenerImpl = value;
                            z = zSafeUnbox5;
                            str5 = str12;
                            str8 = str13;
                            str = str14;
                            str6 = str10;
                            z4 = zSafeUnbox2;
                            drawable = drawable2;
                            z2 = zSafeUnbox4;
                            str7 = null;
                        }
                    }
                } else {
                    zSafeUnbox5 = zSafeUnbox5;
                }
                if ((j & 57344) == 0) {
                    str2 = str15;
                    str9 = str11;
                    z5 = zSafeUnbox3;
                    onClickListenerImpl = value;
                    z = zSafeUnbox5;
                    str5 = str12;
                    str8 = str13;
                    str = str14;
                    str6 = str10;
                    z4 = zSafeUnbox2;
                    drawable = drawable2;
                    z2 = zSafeUnbox4;
                    str7 = null;
                } else {
                    if (firmwareAvailableViewModel != null) {
                        otaStatus = firmwareAvailableViewModel.getOtaStatus();
                    } else {
                        otaStatus = null;
                    }
                    updateRegistration(13, otaStatus);
                    if (otaStatus != null) {
                        str2 = str15;
                        str9 = str11;
                        z5 = zSafeUnbox3;
                        onClickListenerImpl = value;
                        str5 = str12;
                        str8 = str13;
                        str = str14;
                        str6 = str10;
                        z2 = zSafeUnbox4;
                        android.graphics.drawable.Drawable drawable4 = drawable2;
                        str7 = otaStatus.get();
                        z = zSafeUnbox5;
                        z4 = zSafeUnbox2;
                        drawable = drawable4;
                    } else {
                        str2 = str15;
                        str9 = str11;
                        z5 = zSafeUnbox3;
                        onClickListenerImpl = value;
                        z = zSafeUnbox5;
                        str5 = str12;
                        str8 = str13;
                        str = str14;
                        str6 = str10;
                        z4 = zSafeUnbox2;
                        drawable = drawable2;
                        z2 = zSafeUnbox4;
                        str7 = null;
                    }
                }
            } else {
                str12 = str12;
                str13 = str13;
            }
            if ((j & 50176) != 0) {
                if (firmwareAvailableViewModel != null) {
                    updateAvailable = firmwareAvailableViewModel.getUpdateAvailable();
                } else {
                    updateAvailable = null;
                }
                updateRegistration(10, updateAvailable);
                if (updateAvailable != null) {
                    bool2 = updateAvailable.get();
                } else {
                    bool2 = null;
                }
                zSafeUnbox4 = androidx.databinding.ViewDataBinding.safeUnbox(bool2);
            } else {
                str14 = str14;
                zSafeUnbox4 = false;
            }
            if ((j & 51200) != 0) {
                if (firmwareAvailableViewModel != null) {
                    displayPreconditionsError = firmwareAvailableViewModel.getDisplayPreconditionsError();
                } else {
                    displayPreconditionsError = null;
                }
                updateRegistration(11, displayPreconditionsError);
                if (displayPreconditionsError != null) {
                    bool = displayPreconditionsError.get();
                } else {
                    bool = null;
                }
                zSafeUnbox5 = androidx.databinding.ViewDataBinding.safeUnbox(bool);
            } else {
                zSafeUnbox4 = zSafeUnbox4;
                zSafeUnbox5 = false;
            }
            if ((j & 53248) != 0) {
                if (firmwareAvailableViewModel != null) {
                    firmwareVersion = firmwareAvailableViewModel.getFirmwareVersion();
                } else {
                    firmwareVersion = null;
                }
                updateRegistration(12, firmwareVersion);
                if (firmwareVersion != null) {
                }
                if ((j & 57344) == 0) {
                    str2 = str15;
                    str9 = str11;
                    z5 = zSafeUnbox3;
                    onClickListenerImpl = value;
                    z = zSafeUnbox5;
                    str5 = str12;
                    str8 = str13;
                    str = str14;
                    str6 = str10;
                    z4 = zSafeUnbox2;
                    drawable = drawable2;
                    z2 = zSafeUnbox4;
                    str7 = null;
                } else {
                    if (firmwareAvailableViewModel != null) {
                        otaStatus = firmwareAvailableViewModel.getOtaStatus();
                    } else {
                        otaStatus = null;
                    }
                    updateRegistration(13, otaStatus);
                    if (otaStatus != null) {
                        str2 = str15;
                        str9 = str11;
                        z5 = zSafeUnbox3;
                        onClickListenerImpl = value;
                        str5 = str12;
                        str8 = str13;
                        str = str14;
                        str6 = str10;
                        z2 = zSafeUnbox4;
                        android.graphics.drawable.Drawable drawable5 = drawable2;
                        str7 = otaStatus.get();
                        z = zSafeUnbox5;
                        z4 = zSafeUnbox2;
                        drawable = drawable5;
                    } else {
                        str2 = str15;
                        str9 = str11;
                        z5 = zSafeUnbox3;
                        onClickListenerImpl = value;
                        z = zSafeUnbox5;
                        str5 = str12;
                        str8 = str13;
                        str = str14;
                        str6 = str10;
                        z4 = zSafeUnbox2;
                        drawable = drawable2;
                        z2 = zSafeUnbox4;
                        str7 = null;
                    }
                }
            } else {
                zSafeUnbox5 = zSafeUnbox5;
            }
            if ((j & 57344) == 0) {
                str2 = str15;
                str9 = str11;
                z5 = zSafeUnbox3;
                onClickListenerImpl = value;
                z = zSafeUnbox5;
                str5 = str12;
                str8 = str13;
                str = str14;
                str6 = str10;
                z4 = zSafeUnbox2;
                drawable = drawable2;
                z2 = zSafeUnbox4;
                str7 = null;
            } else {
                if (firmwareAvailableViewModel != null) {
                    otaStatus = firmwareAvailableViewModel.getOtaStatus();
                } else {
                    otaStatus = null;
                }
                updateRegistration(13, otaStatus);
                if (otaStatus != null) {
                    str2 = str15;
                    str9 = str11;
                    z5 = zSafeUnbox3;
                    onClickListenerImpl = value;
                    str5 = str12;
                    str8 = str13;
                    str = str14;
                    str6 = str10;
                    z2 = zSafeUnbox4;
                    android.graphics.drawable.Drawable drawable6 = drawable2;
                    str7 = otaStatus.get();
                    z = zSafeUnbox5;
                    z4 = zSafeUnbox2;
                    drawable = drawable6;
                } else {
                    str2 = str15;
                    str9 = str11;
                    z5 = zSafeUnbox3;
                    onClickListenerImpl = value;
                    z = zSafeUnbox5;
                    str5 = str12;
                    str8 = str13;
                    str = str14;
                    str6 = str10;
                    z4 = zSafeUnbox2;
                    drawable = drawable2;
                    z2 = zSafeUnbox4;
                    str7 = null;
                }
            }
        } else {
            z = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            zSafeUnbox = false;
            str5 = null;
            z2 = false;
            drawable = null;
            onClickListenerImpl = null;
            str6 = null;
            str7 = null;
            z3 = false;
            z4 = false;
            z5 = false;
            str8 = null;
            str9 = null;
        }
        powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBindingImpl.OnClickListenerImpl onClickListenerImpl3 = onClickListenerImpl;
        if ((j & 50176) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.actionLayout, z2);
        }
        if ((j & 49153) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, str3);
        }
        if ((j & 49664) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, str);
        }
        if ((j & 49160) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView10, zSafeUnbox);
        }
        if ((j & 51200) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.showWithTimer(this.mboundView11, z);
        }
        if ((j & 49154) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, str4);
        }
        if ((j & 53248) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, str2);
        }
        if ((j & 49216) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, str5);
        }
        if ((j & 49156) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, str6);
        }
        if ((57344 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, str7);
        }
        if ((49408 & j) != 0) {
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView7, drawable);
            this.mboundView7.setEnabled(z3);
        }
        if ((49152 & j) != 0) {
            this.mboundView7.setOnClickListener(onClickListenerImpl3);
        }
        if ((49280 & j) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, str8);
        }
        if ((j & 49184) != 0) {
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView7, z5);
            powerwatch.matrix.com.pwgen2android.shared.ui.BindingAdaptersKt.goneUnless(this.mboundView8, z4);
        }
        if ((j & 49168) != 0) {
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, str9);
        }
    }

    public static class OnClickListenerImpl implements android.view.View.OnClickListener {
        private powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel value;

        public powerwatch.matrix.com.pwgen2android.databinding.FragmentFirmwareAvailableBindingImpl.OnClickListenerImpl setValue(powerwatch.matrix.com.pwgen2android.main.update.FirmwareAvailableViewModel value) {
            this.value = value;
            if (value == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View arg0) {
            this.value.startUpdate(arg0);
        }
    }
}
