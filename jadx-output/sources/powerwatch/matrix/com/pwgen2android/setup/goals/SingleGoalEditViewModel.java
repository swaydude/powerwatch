package powerwatch.matrix.com.pwgen2android.setup.goals;

/* JADX INFO: compiled from: SingleGoalEditViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0002\u0010\u0012J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0007R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u00060\u00060\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010#0#0\u001e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u001f\u0010%\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010#0#0\u001e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!¨\u0006*"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/SingleGoalEditViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "activityContext", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "settingsLiteCommunicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "goalsNotificationPersistence", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;", "savePreferencesViewModel", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V", "newConfig", "Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;", "config", "getConfig", "()Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;", "setConfig", "(Lpowerwatch/matrix/com/pwgen2android/setup/goals/EditGoalConfig;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "showSaveProgress", "Landroidx/databinding/ObservableField;", "", "getShowSaveProgress", "()Landroidx/databinding/ObservableField;", "valueField", "", "getValueField", "valueUnitField", "getValueUnitField", "onBackClicked", "", "onSaveClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SingleGoalEditViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel $$delegate_0;
    private powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig config;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;
    private final androidx.databinding.ObservableField<java.lang.String> valueField;
    private final androidx.databinding.ObservableField<java.lang.String> valueUnitField;

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.$$delegate_0.getShowSaveProgress();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleGoalEditViewModel(android.content.Context activityContext, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel) {
        super(activityContext, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsLiteCommunicator, "settingsLiteCommunicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsNotificationPersistence, "goalsNotificationPersistence");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePreferencesViewModel, "savePreferencesViewModel");
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.settingsLiteCommunicator = settingsLiteCommunicator;
        this.rxBus = rxBus;
        this.goalsNotificationPersistence = goalsNotificationPersistence;
        this.$$delegate_0 = savePreferencesViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.valueField = new androidx.databinding.ObservableField<>("");
        this.valueUnitField = new androidx.databinding.ObservableField<>("");
    }

    public /* synthetic */ SingleGoalEditViewModel(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fragmentManager, goalConfigurationRepository, userPrefsUtils, settingsLiteCommunicator, rxBus, goalsNotificationPersistence, (i & 128) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl(null, 1, null) : savePreferencesViewModel);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getValueField() {
        return this.valueField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getValueUnitField() {
        return this.valueUnitField;
    }

    public final powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig getConfig() {
        return this.config;
    }

    public final void setConfig(powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig) {
        this.config = editGoalConfig;
        if (editGoalConfig != null) {
            this.valueField.set(editGoalConfig.getValue().toString());
            this.valueUnitField.set(editGoalConfig.getUnit());
        }
    }

    public final void onSaveClicked() {
        getShowSaveProgress().set(true);
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(this.goalConfigurationRepository, true, false, 2, null).firstOrError().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SingleGoalEditViewModel$KO8GuAOMQkBXrctbz8PCXFak5P4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel.m2875onSaveClicked$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SingleGoalEditViewModel$py3e_SsB56Qtzj1cO4UMDCQxM84
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel.m2876onSaveClicked$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SingleGoalEditViewModel$Kvl7Qv3E2xcKMfJJR2gpaaSUR8g
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel.m2877onSaveClicked$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SingleGoalEditViewModel$2trNlw8s47PGYR_TICtXR5ErZqY
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel.m2878onSaveClicked$lambda4(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SingleGoalEditViewModel$ku_LjPW6wcW1Xm3cafutBoCnhzc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel.m2879onSaveClicked$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration m2875onSaveClicked$lambda1(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration it) {
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfigurationCopy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.String str = this$0.getValueField().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig config = this$0.getConfig();
        if (config == null) {
            return null;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.GoalType type = config.getType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps.INSTANCE)) {
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(str);
            goalConfigurationCopy = it.copy((223 & 1) != 0 ? it.id : 0L, (223 & 2) != 0 ? it.calories : 0, (223 & 4) != 0 ? it.distance : 0.0f, (223 & 8) != 0 ? it.power : 0, (223 & 16) != 0 ? it.sleep : 0, (223 & 32) != 0 ? it.steps : intOrNull == null ? 10000 : intOrNull.intValue(), (223 & 64) != 0 ? it.createdAt : 0L, (223 & 128) != 0 ? it.shouldSync : false);
            this$0.goalsNotificationPersistence.setGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Steps.INSTANCE, false);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories.INSTANCE)) {
            java.lang.Integer intOrNull2 = kotlin.text.StringsKt.toIntOrNull(str);
            goalConfigurationCopy = it.copy((223 & 1) != 0 ? it.id : 0L, (223 & 2) != 0 ? it.calories : intOrNull2 == null ? 2000 : intOrNull2.intValue(), (223 & 4) != 0 ? it.distance : 0.0f, (223 & 8) != 0 ? it.power : 0, (223 & 16) != 0 ? it.sleep : 0, (223 & 32) != 0 ? it.steps : 0, (223 & 64) != 0 ? it.createdAt : 0L, (223 & 128) != 0 ? it.shouldSync : false);
            this$0.goalsNotificationPersistence.setGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Calories.INSTANCE, false);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep.INSTANCE)) {
            java.lang.String str2 = this$0.getValueField().get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            java.lang.Float floatOrNull = kotlin.text.StringsKt.toFloatOrNull(str2);
            goalConfigurationCopy = it.copy((223 & 1) != 0 ? it.id : 0L, (223 & 2) != 0 ? it.calories : 0, (223 & 4) != 0 ? it.distance : 0.0f, (223 & 8) != 0 ? it.power : 0, (223 & 16) != 0 ? it.sleep : kotlin.math.MathKt.roundToInt((floatOrNull == null ? 8.0f : floatOrNull.floatValue()) * 60), (223 & 32) != 0 ? it.steps : 0, (223 & 64) != 0 ? it.createdAt : 0L, (223 & 128) != 0 ? it.shouldSync : false);
            this$0.goalsNotificationPersistence.setGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Sleep.INSTANCE, false);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power.INSTANCE)) {
            java.lang.String str3 = this$0.getValueField().get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
            java.lang.Integer intOrNull3 = kotlin.text.StringsKt.toIntOrNull(str3);
            goalConfigurationCopy = it.copy((223 & 1) != 0 ? it.id : 0L, (223 & 2) != 0 ? it.calories : 0, (223 & 4) != 0 ? it.distance : 0.0f, (223 & 8) != 0 ? it.power : intOrNull3 == null ? 1000 : intOrNull3.intValue(), (223 & 16) != 0 ? it.sleep : 0, (223 & 32) != 0 ? it.steps : 0, (223 & 64) != 0 ? it.createdAt : 0L, (223 & 128) != 0 ? it.shouldSync : false);
            this$0.goalsNotificationPersistence.setGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Power.INSTANCE, false);
        } else {
            goalConfigurationCopy = it;
        }
        return goalConfigurationCopy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-2, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2876onSaveClicked$lambda2(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddRepository.DefaultImpls.save$default(this$0.goalConfigurationRepository, it, false, 2, null).andThen(this$0.settingsLiteCommunicator.applySetting(new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Goals(it, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-3, reason: not valid java name */
    public static final void m2877onSaveClicked$lambda3(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getShowSaveProgress().set(false);
        this$0.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.DataReloadEvent.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-4, reason: not valid java name */
    public static final void m2878onSaveClicked$lambda4(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-5, reason: not valid java name */
    public static final void m2879onSaveClicked$lambda5(powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditViewModel this$0, java.lang.Throwable th) {
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
        fragmentManager.popBackStack();
    }
}
