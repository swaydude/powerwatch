package powerwatch.matrix.com.pwgen2android.setup.editBiometrics;

/* JADX INFO: compiled from: SingleWheelViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0002\u0010\u0014J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nH\u0016J\u0018\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\f0\f0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/SingleWheelViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "settingsLiteCommunicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;", "activityContext", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "sleepTimeStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;", "savePreferencesViewModel", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "goal", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "showSaveProgress", "Landroidx/databinding/ObservableField;", "", "getShowSaveProgress", "()Landroidx/databinding/ObservableField;", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "onBackClicked", "", "onCreateView", "context", "onSaveClicked", "wheelConfig", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/WheelConfig;", "pickerValue", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SingleWheelViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel $$delegate_0;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goal;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.User user;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m2832onCreateView$lambda2(java.lang.Throwable th) {
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.$$delegate_0.getShowSaveProgress();
    }

    public /* synthetic */ SingleWheelViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userAccountRepository, userPrefsUtils, settingsLiteCommunicator, context, fragmentManager, rxBus, goalConfigurationRepository, sleepTimeStorage, (i & 256) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl(null, 1, null) : savePreferencesViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleWheelViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator, android.content.Context activityContext, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.SleepTimeStorage sleepTimeStorage, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel) {
        super(activityContext, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsLiteCommunicator, "settingsLiteCommunicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepTimeStorage, "sleepTimeStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePreferencesViewModel, "savePreferencesViewModel");
        this.userAccountRepository = userAccountRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.settingsLiteCommunicator = settingsLiteCommunicator;
        this.rxBus = rxBus;
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.sleepTimeStorage = sleepTimeStorage;
        this.$$delegate_0 = savePreferencesViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        getCompositeDisposable().add(this.userPrefsUtils.userPrefs().observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$SingleWheelViewModel$azlnd4vBpGtlL8jZ2qc2Qi4kcvs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel.m2830onCreateView$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }));
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(this.goalConfigurationRepository, false, false, 3, null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$SingleWheelViewModel$KRovPt9xNaeT3dknYdjwjtNTEE4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel.m2831onCreateView$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$SingleWheelViewModel$jMNSohqGm-NSJ4PggUlvXRwcaiw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel.m2832onCreateView$lambda2((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m2830onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.user = it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m2831onCreateView$lambda1(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.goal = it;
    }

    public final void onSaveClicked(powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelConfig wheelConfig, java.lang.String pickerValue) {
        int iDefaultUnitValue;
        final powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Biometrics biometrics;
        java.lang.String unit;
        io.reactivex.Completable completableComplete;
        io.reactivex.Completable completableAndThen;
        float fDefaultUnitValue;
        java.lang.String unit2;
        int i;
        int i2;
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfoPrevious;
        java.lang.Integer intOrNull;
        java.lang.String languageKey;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user;
        java.lang.String[] displayedValues;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wheelConfig, "wheelConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pickerValue, "pickerValue");
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user2 = this.user;
        if (user2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        boolean zIsMetricsUsed = userPrefsUtils.isMetricsUsed(user2);
        powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType type = wheelConfig.getType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Height.INSTANCE)) {
            try {
                powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter adapter = wheelConfig.getAdapter();
                if (adapter == null || (unit = adapter.getUnit()) == null) {
                    unit = "";
                }
                iDefaultUnitValue = java.lang.Integer.parseInt(kotlin.text.StringsKt.replace$default(pickerValue, unit, "", false, 4, (java.lang.Object) null));
            } catch (java.lang.Exception unused) {
                iDefaultUnitValue = this.userPrefsUtils.defaultUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE, zIsMetricsUsed);
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.User user3 = this.user;
            if (user3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.User userCopy = user3.copy((1023 & 1) != 0 ? user3.uid : 0L, (1023 & 2) != 0 ? user3.enabled : false, (1023 & 4) != 0 ? user3.name : null, (1023 & 8) != 0 ? user3.email : null, (1023 & 16) != 0 ? user3.password : null, (1023 & 32) != 0 ? user3.age : 0, (1023 & 64) != 0 ? user3.height : kotlin.math.MathKt.roundToInt(this.userPrefsUtils.getMetricValue(java.lang.Integer.valueOf(iDefaultUnitValue), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE).getFirst().floatValue()), (1023 & 128) != 0 ? user3.weight : 0.0f, (1023 & 256) != 0 ? user3.gender : null, (1023 & 512) != 0 ? user3.shouldSync : false, (1023 & 1024) != 0 ? user3.accountSettings : null);
            this.user = userCopy;
            if (userCopy == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            biometrics = new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Biometrics(userCopy, null, 2, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Weight.INSTANCE)) {
            try {
                powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter adapter2 = wheelConfig.getAdapter();
                if (adapter2 == null || (unit2 = adapter2.getUnit()) == null) {
                    unit2 = "";
                }
                fDefaultUnitValue = java.lang.Float.parseFloat(kotlin.text.StringsKt.replace$default(pickerValue, unit2, "", false, 4, (java.lang.Object) null));
            } catch (java.lang.Exception unused2) {
                fDefaultUnitValue = this.userPrefsUtils.defaultUnitValue(powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE, zIsMetricsUsed);
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.User user4 = this.user;
            if (user4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.User userCopy2 = user4.copy((1023 & 1) != 0 ? user4.uid : 0L, (1023 & 2) != 0 ? user4.enabled : false, (1023 & 4) != 0 ? user4.name : null, (1023 & 8) != 0 ? user4.email : null, (1023 & 16) != 0 ? user4.password : null, (1023 & 32) != 0 ? user4.age : 0, (1023 & 64) != 0 ? user4.height : 0, (1023 & 128) != 0 ? user4.weight : this.userPrefsUtils.getMetricValue(java.lang.Float.valueOf(fDefaultUnitValue), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE).getFirst().floatValue(), (1023 & 256) != 0 ? user4.gender : null, (1023 & 512) != 0 ? user4.shouldSync : false, (1023 & 1024) != 0 ? user4.accountSettings : null);
            this.user = userCopy2;
            if (userCopy2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            biometrics = new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Biometrics(userCopy2, null, 2, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Age.INSTANCE)) {
            try {
                i = java.lang.Integer.parseInt(pickerValue);
            } catch (java.lang.Exception unused3) {
                i = 25;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.User user5 = this.user;
            if (user5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.User userCopy3 = user5.copy((1023 & 1) != 0 ? user5.uid : 0L, (1023 & 2) != 0 ? user5.enabled : false, (1023 & 4) != 0 ? user5.name : null, (1023 & 8) != 0 ? user5.email : null, (1023 & 16) != 0 ? user5.password : null, (1023 & 32) != 0 ? user5.age : i, (1023 & 64) != 0 ? user5.height : 0, (1023 & 128) != 0 ? user5.weight : 0.0f, (1023 & 256) != 0 ? user5.gender : null, (1023 & 512) != 0 ? user5.shouldSync : false, (1023 & 1024) != 0 ? user5.accountSettings : null);
            this.user = userCopy3;
            if (userCopy3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            biometrics = new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Biometrics(userCopy3, null, 2, null);
        } else {
            int iIntValue = 0;
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Gender.INSTANCE)) {
                powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter adapter3 = wheelConfig.getAdapter();
                iIntValue = adapter3 != null ? adapter3.getPosition(pickerValue) : 0;
                powerwatch.matrix.com.pwgen2android.shared.data.models.User user6 = this.user;
                if (user6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                powerwatch.matrix.com.pwgen2android.setup.biometrics.StringPickerAdapter adapter4 = wheelConfig.getAdapter();
                powerwatch.matrix.com.pwgen2android.setup.biometrics.PickedData pickedData = adapter4 == null ? null : adapter4.getPickedData();
                java.lang.String description = (pickedData == null || (displayedValues = pickedData.getDisplayedValues()) == null) ? null : displayedValues[iIntValue];
                if (description == null) {
                    description = powerwatch.matrix.com.pwgen2android.shared.data.models.Gender.Male.INSTANCE.getDescription();
                }
                powerwatch.matrix.com.pwgen2android.shared.data.models.User userCopy4 = user6.copy((1023 & 1) != 0 ? user6.uid : 0L, (1023 & 2) != 0 ? user6.enabled : false, (1023 & 4) != 0 ? user6.name : null, (1023 & 8) != 0 ? user6.email : null, (1023 & 16) != 0 ? user6.password : null, (1023 & 32) != 0 ? user6.age : 0, (1023 & 64) != 0 ? user6.height : 0, (1023 & 128) != 0 ? user6.weight : 0.0f, (1023 & 256) != 0 ? user6.gender : description, (1023 & 512) != 0 ? user6.shouldSync : false, (1023 & 1024) != 0 ? user6.accountSettings : null);
                this.user = userCopy4;
                if (userCopy4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                biometrics = new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Biometrics(userCopy4, null, 2, null);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Clock.INSTANCE)) {
                try {
                    i2 = java.lang.Integer.parseInt(kotlin.text.StringsKt.replace$default(pickerValue, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.hourUnit, "", false, 4, (java.lang.Object) null));
                } catch (java.lang.Exception unused4) {
                    i2 = 12;
                }
                powerwatch.matrix.com.pwgen2android.shared.data.models.User user7 = this.user;
                if (user7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                if (user7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                powerwatch.matrix.com.pwgen2android.shared.data.models.User userCopy5 = user7.copy((1023 & 1) != 0 ? user7.uid : 0L, (1023 & 2) != 0 ? user7.enabled : false, (1023 & 4) != 0 ? user7.name : null, (1023 & 8) != 0 ? user7.email : null, (1023 & 16) != 0 ? user7.password : null, (1023 & 32) != 0 ? user7.age : 0, (1023 & 64) != 0 ? user7.height : 0, (1023 & 128) != 0 ? user7.weight : 0.0f, (1023 & 256) != 0 ? user7.gender : null, (1023 & 512) != 0 ? user7.shouldSync : false, (1023 & 1024) != 0 ? user7.accountSettings : powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings.copy$default(user7.getAccountSettings(), null, null, i2, 3, null));
                this.user = userCopy5;
                if (userCopy5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                biometrics = new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Units(userCopy5, null, 2, null);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.Language.INSTANCE)) {
                biometrics = (powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting) null;
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.biometrics.WheelType.SleepTime.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> languageInfos = powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getLanguageInfos();
                java.util.ListIterator<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> listIterator = languageInfos.listIterator(languageInfos.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        languageInfoPrevious = null;
                        break;
                    }
                    languageInfoPrevious = listIterator.previous();
                    languageKey = languageInfoPrevious.getLanguageKey();
                    user = this.user;
                    if (user == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                        throw null;
                    }
                } while (!kotlin.jvm.internal.Intrinsics.areEqual(languageKey, user.getAccountSettings().getLanguage()));
                powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo = languageInfoPrevious;
                java.util.Locale locale = languageInfo == null ? null : languageInfo.getLocale();
                if (locale == null) {
                    locale = powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getDefaultLanguageInfo().getLocale();
                }
                java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(kotlin.text.StringsKt.split$default((java.lang.CharSequence) pickerValue, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null), 0);
                if (str != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(str)) != null) {
                    iIntValue = intOrNull.intValue();
                }
                powerwatch.matrix.com.pwgen2android.shared.data.models.User user8 = this.user;
                if (user8 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                    throw null;
                }
                powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = this.goal;
                if (goalConfiguration != null) {
                    biometrics = new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.SleepTime(user8, locale, goalConfiguration, iIntValue);
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("goal");
                    throw null;
                }
            }
        }
        getShowSaveProgress().set(true);
        if (biometrics instanceof powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.SleepTime) {
            completableAndThen = this.settingsLiteCommunicator.applySetting(biometrics).andThen(io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$SingleWheelViewModel$JsjYoV96W8NhxT8GnO5Apx5w_yo
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel.m2833onSaveClicked$lambda4(this.f$0, biometrics);
                }
            }));
        } else {
            powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository = this.userAccountRepository;
            powerwatch.matrix.com.pwgen2android.shared.data.models.User user9 = this.user;
            if (user9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
                throw null;
            }
            io.reactivex.Completable completableUpdate = userAccountRepository.update(user9);
            if (biometrics != null) {
                completableComplete = this.settingsLiteCommunicator.applySetting(biometrics);
            } else {
                completableComplete = io.reactivex.Completable.complete();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete, "complete()");
            }
            completableAndThen = completableUpdate.andThen(completableComplete);
        }
        completableAndThen.observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$SingleWheelViewModel$zFPz9j0XPF-c5Y35NzqEliJ8758
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel.m2834onSaveClicked$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$SingleWheelViewModel$NCBSUHELuuxFeVuwFVmRZAokLrM
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel.m2835onSaveClicked$lambda6(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$SingleWheelViewModel$N_DfCfnmH6Fwb0YlOG-fAhPn3Sg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel.m2836onSaveClicked$lambda7(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-4, reason: not valid java name */
    public static final void m2833onSaveClicked$lambda4(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel this$0, powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting watchSetting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.sleepTimeStorage.saveSleepTime(((powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.SleepTime) watchSetting).getSleepTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-5, reason: not valid java name */
    public static final void m2834onSaveClicked$lambda5(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.DataReloadEvent.INSTANCE);
        this$0.getShowSaveProgress().set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-6, reason: not valid java name */
    public static final void m2835onSaveClicked$lambda6(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-7, reason: not valid java name */
    public static final void m2836onSaveClicked$lambda7(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.SingleWheelViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackClicked();
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        super.onBackClicked();
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.popBackStackAllowingStateLoss(fragmentManager);
    }
}
