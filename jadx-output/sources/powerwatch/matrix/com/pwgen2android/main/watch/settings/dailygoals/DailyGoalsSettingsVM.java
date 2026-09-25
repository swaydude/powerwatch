package powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals;

/* JADX INFO: compiled from: DailyGoalsSettingsVM.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0016J\n\u0010&\u001a\u00020\"*\u00020'J\n\u0010(\u001a\u00020\"*\u00020'J\n\u0010)\u001a\u00020\"*\u00020'J\n\u0010*\u001a\u00020\"*\u00020'R\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\f0\f0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/watch/settings/dailygoals/DailyGoalsSettingsVM;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "goalsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V", "caloriesField", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getCaloriesField", "()Landroidx/databinding/ObservableField;", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "goalConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "managerWeakReference", "powerField", "getPowerField", "sleepField", "getSleepField", "stepsField", "getStepsField", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "onBackClicked", "", "onCreateView", "context", "Landroid/content/Context;", "onCaloriesClicked", "Landroid/view/View;", "onPowerClicked", "onSleepClicked", "onStepsClicked", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DailyGoalsSettingsVM extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.watch.PWWatchViewModel.class).getSimpleName();
    private final androidx.databinding.ObservableField<java.lang.String> caloriesField;
    private final java.lang.ref.WeakReference<android.app.Activity> contextWeakReference;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> managerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.String> powerField;
    private final androidx.databinding.ObservableField<java.lang.String> sleepField;
    private final androidx.databinding.ObservableField<java.lang.String> stepsField;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.User user;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-1, reason: not valid java name */
    public static final void m1977onCreateView$lambda1(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-3, reason: not valid java name */
    public static final void m1979onCreateView$lambda3(java.lang.Throwable th) {
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DailyGoalsSettingsVM(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager) {
        super(activity, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsRepository, "goalsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.goalsRepository = goalsRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.userAccountRepository = userAccountRepository;
        this.stepsField = new androidx.databinding.ObservableField<>("");
        this.caloriesField = new androidx.databinding.ObservableField<>("");
        this.sleepField = new androidx.databinding.ObservableField<>("");
        this.powerField = new androidx.databinding.ObservableField<>("");
        this.managerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.contextWeakReference = new java.lang.ref.WeakReference<>(activity);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getStepsField() {
        return this.stepsField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getCaloriesField() {
        return this.caloriesField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getSleepField() {
        return this.sleepField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getPowerField() {
        return this.powerField;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(this.goalsRepository, false, false, 3, null).firstOrError().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.-$$Lambda$DailyGoalsSettingsVM$HtG_0OT_qCH7QykBrd2blYFQ-M4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM.m1976onCreateView$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.-$$Lambda$DailyGoalsSettingsVM$obPsJfaeMnneDfZwfIsn0MNlhCQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM.m1977onCreateView$lambda1((java.lang.Throwable) obj);
            }
        }));
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, false, false, 3, null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.-$$Lambda$DailyGoalsSettingsVM$mZJakJYGK4kL4S44xNbIeOjLXBI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM.m1978onCreateView$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.-$$Lambda$DailyGoalsSettingsVM$sUwmdkrJwQ6xLMDbfNxsXdZwfiY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM.m1979onCreateView$lambda3((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-0, reason: not valid java name */
    public static final void m1976onCreateView$lambda0(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.goalConfig = goalConfiguration;
        this$0.getStepsField().set(java.lang.String.valueOf(goalConfiguration.getSteps()));
        this$0.getCaloriesField().set(java.lang.String.valueOf(goalConfiguration.getCalories()));
        androidx.databinding.ObservableField<java.lang.String> sleepField = this$0.getSleepField();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(goalConfiguration.getSleep() / 60);
        sb.append('h');
        sleepField.set(sb.toString());
        this$0.getPowerField().set(goalConfiguration.getPower() + powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateView$lambda-2, reason: not valid java name */
    public static final void m1978onCreateView$lambda2(powerwatch.matrix.com.pwgen2android.main.watch.settings.dailygoals.DailyGoalsSettingsVM this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.user = it;
    }

    public final void onStepsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = this.goalConfig;
        if (goalConfiguration == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Steps.INSTANCE, java.lang.Integer.valueOf(goalConfiguration.getSteps()), "");
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.INSTANCE.newInstance(editGoalConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onCaloriesClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = this.goalConfig;
        if (goalConfiguration == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils = this.userPrefsUtils;
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user = this.user;
        if (user == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("user");
            throw null;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Calories.INSTANCE, java.lang.Integer.valueOf(goalConfiguration.getCalories()), userPrefsUtils.isMetricsUsed(user) ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricCaloriesUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialCaloriesUnit);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.INSTANCE.newInstance(editGoalConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onSleepClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = this.goalConfig;
        if (goalConfiguration == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Sleep.INSTANCE, java.lang.Float.valueOf(goalConfiguration.getSleep() / 60), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.hourUnit);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.INSTANCE.newInstance(editGoalConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    public final void onPowerClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = this.goalConfig;
        if (goalConfiguration == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig editGoalConfig = new powerwatch.matrix.com.pwgen2android.setup.goals.EditGoalConfig(powerwatch.matrix.com.pwgen2android.setup.goals.GoalType.Power.INSTANCE, java.lang.Integer.valueOf(goalConfiguration.getPower()), powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.powerUnit);
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.goals.SingleGoalEditFragment.INSTANCE.newInstance(editGoalConfig), powerwatch.matrix.com.pwgen2android.R.id.watch_fragment_container, false, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationType.Side.INSTANCE, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        super.onBackClicked();
        androidx.fragment.app.FragmentManager fragmentManager = this.managerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }
}
