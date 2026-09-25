package powerwatch.matrix.com.pwgen2android.setup.goals;

/* JADX INFO: compiled from: SetGoalsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0002\u0010\u000eJ\b\u0010$\u001a\u00020%H\u0016J\u0006\u0010&\u001a\u00020%R\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00060\u00060\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014R\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u001f\u0010 \u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/goals/SetGoalsViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "activityContext", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "savePreferencesViewModel", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V", "caloriesField", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getCaloriesField", "()Landroidx/databinding/ObservableField;", "distanceField", "getDistanceField", "distanceUnitField", "getDistanceUnitField", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "showSaveProgress", "", "getShowSaveProgress", "sleepField", "getSleepField", "sleepUnitField", "getSleepUnitField", "stepsField", "getStepsField", "onBackClicked", "", "onSaveClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SetGoalsViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel $$delegate_0;
    private final androidx.databinding.ObservableField<java.lang.String> caloriesField;
    private final androidx.databinding.ObservableField<java.lang.String> distanceField;
    private final androidx.databinding.ObservableField<java.lang.String> distanceUnitField;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final androidx.databinding.ObservableField<java.lang.String> sleepField;
    private final androidx.databinding.ObservableField<java.lang.String> sleepUnitField;
    private final androidx.databinding.ObservableField<java.lang.String> stepsField;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m2858_init_$lambda3(java.lang.Throwable th) {
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.$$delegate_0.getShowSaveProgress();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SetGoalsViewModel(android.content.Context activityContext, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel) {
        super(activityContext, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePreferencesViewModel, "savePreferencesViewModel");
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.rxBus = rxBus;
        this.$$delegate_0 = savePreferencesViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.stepsField = new androidx.databinding.ObservableField<>("0");
        this.distanceField = new androidx.databinding.ObservableField<>(io.fabric.sdk.android.services.common.IdManager.DEFAULT_VERSION_NAME);
        this.caloriesField = new androidx.databinding.ObservableField<>("0");
        this.sleepField = new androidx.databinding.ObservableField<>(io.fabric.sdk.android.services.common.IdManager.DEFAULT_VERSION_NAME);
        this.distanceUnitField = new androidx.databinding.ObservableField<>("");
        this.sleepUnitField = new androidx.databinding.ObservableField<>(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.hourUnit);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(goalConfigurationRepository, null, true, 1, null).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$9rP98uG024Jq4tI-CEfUOw8cbVk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2855_init_$lambda0((java.util.List) obj);
            }
        }).withLatestFrom(userPrefsUtils.isMetricsUsed(), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$gdZKAJ9wzBwXLzJufDcU9Fv2WYY
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2856_init_$lambda1((powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj, (java.lang.Boolean) obj2);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$sfw1eAxehwwf-RFbJymnRO3QNvg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2857_init_$lambda2(this.f$0, (kotlin.Pair) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$rJqwaZ6STOm-iJfTGr_G-bD-i9c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2858_init_$lambda3((java.lang.Throwable) obj);
            }
        }));
    }

    public /* synthetic */ SetGoalsViewModel(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl savePreferencesViewModelImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fragmentManager, goalConfigurationRepository, userPrefsUtils, rxBus, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl(null, 1, null) : savePreferencesViewModelImpl);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getStepsField() {
        return this.stepsField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getDistanceField() {
        return this.distanceField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getCaloriesField() {
        return this.caloriesField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSleepField() {
        return this.sleepField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getDistanceUnitField() {
        return this.distanceUnitField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSleepUnitField() {
        return this.sleepUnitField;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration m2855_init_$lambda0(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) kotlin.collections.CollectionsKt.last(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final kotlin.Pair m2856_init_$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goals, java.lang.Boolean isMetricUsed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "goals");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isMetricUsed, "isMetricUsed");
        return new kotlin.Pair(goals, isMetricUsed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    public static final void m2857_init_$lambda2(powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) pair.getFirst();
        boolean zBooleanValue = ((java.lang.Boolean) pair.getSecond()).booleanValue();
        kotlin.Pair<java.lang.Float, java.lang.String> value = this$0.userPrefsUtils.getValue(java.lang.Float.valueOf(goalConfiguration.getDistance()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        this$0.getStepsField().set(java.lang.String.valueOf(goalConfiguration.getSteps()));
        this$0.getDistanceField().set(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(value.getFirst().floatValue()));
        this$0.getDistanceUnitField().set(zBooleanValue ? "km" : "mi");
        this$0.getSleepField().set(java.lang.String.valueOf(goalConfiguration.getSleep() / 60));
        this$0.getCaloriesField().set(java.lang.String.valueOf(goalConfiguration.getCalories()));
    }

    public final void onSaveClicked() {
        getShowSaveProgress().set(true);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this.goalConfigurationRepository, null, true, 1, null).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$Ci75bGDOWUgk-bDBwZt8d22X-Zg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2865onSaveClicked$lambda4((java.util.List) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$Jp0i5Wd5bVzNfalVJkV1uMbqaz8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2866onSaveClicked$lambda5(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$tZpWdnJ13KaT-1tTKdwhJh8Brj8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2867onSaveClicked$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$5NYHmslSA1yn4gEdMVMrTGw8qnQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2868onSaveClicked$lambda7(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$N3-ATP30UQeKYmrlbnbMQbKo-0w
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2869onSaveClicked$lambda8(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.goals.-$$Lambda$SetGoalsViewModel$lhassoqZlPc52vWyCr1W8S_09Pc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel.m2870onSaveClicked$lambda9(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration m2865onSaveClicked$lambda4(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) kotlin.collections.CollectionsKt.last(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-5, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration m2866onSaveClicked$lambda5(powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils = this$0.userPrefsUtils;
        java.lang.String str = this$0.getDistanceField().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        float fFloatValue = userPrefsUtils.getMetricValue(java.lang.Float.valueOf(java.lang.Float.parseFloat(str)), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE).getFirst().floatValue();
        java.lang.String str2 = this$0.getSleepField().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        float f = java.lang.Float.parseFloat(str2) * 60;
        java.lang.String str3 = this$0.getCaloriesField().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
        int i = java.lang.Integer.parseInt(str3);
        java.lang.String str4 = this$0.getStepsField().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str4);
        return it.copy((223 & 1) != 0 ? it.id : 0L, (223 & 2) != 0 ? it.calories : i, (223 & 4) != 0 ? it.distance : fFloatValue, (223 & 8) != 0 ? it.power : 0, (223 & 16) != 0 ? it.sleep : kotlin.math.MathKt.roundToInt(f), (223 & 32) != 0 ? it.steps : java.lang.Integer.parseInt(str4), (223 & 64) != 0 ? it.createdAt : 0L, (223 & 128) != 0 ? it.shouldSync : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-6, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2867onSaveClicked$lambda6(powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddRepository.DefaultImpls.save$default(this$0.goalConfigurationRepository, it, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-7, reason: not valid java name */
    public static final void m2868onSaveClicked$lambda7(powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getShowSaveProgress().set(false);
        this$0.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.DataReloadEvent.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-8, reason: not valid java name */
    public static final void m2869onSaveClicked$lambda8(powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-9, reason: not valid java name */
    public static final void m2870onSaveClicked$lambda9(powerwatch.matrix.com.pwgen2android.setup.goals.SetGoalsViewModel this$0, java.lang.Throwable th) {
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
