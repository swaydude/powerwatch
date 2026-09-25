package powerwatch.matrix.com.pwgen2android.setup.getstarted;

/* JADX INFO: compiled from: GetStartedViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\n\u0010\u001c\u001a\u00020\u0018*\u00020\u001dR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\r0\r0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00150\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "biometricsViewModel", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "fragmentManagerWeakReference", "isButtonVisible", "Landroidx/databinding/ObservableField;", "", "()Landroidx/databinding/ObservableField;", "onBackClicked", "", "onCreateView", "context", "Landroid/content/Context;", "onNextClicked", "Landroid/view/View;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GetStartedViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<android.app.Activity> activityWeakReference;
    private final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel biometricsViewModel;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onNextClicked$lambda-2, reason: not valid java name */
    public static final void m2850onNextClicked$lambda2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onNextClicked$lambda-3, reason: not valid java name */
    public static final void m2851onNextClicked$lambda3(java.lang.Throwable th) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetStartedViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel biometricsViewModel, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricsViewModel, "biometricsViewModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.userAccountRepository = userAccountRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.languageController = languageController;
        this.biometricsViewModel = biometricsViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.activityWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.isButtonVisible = new androidx.databinding.ObservableField<>(true);
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible() {
        return this.isButtonVisible;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        this.biometricsViewModel.getTextColor().set(java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(context.getApplicationContext(), powerwatch.matrix.com.pwgen2android.R.color.black)));
        this.biometricsViewModel.setBiometrics(new powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics(0, null, null, null, null, false, 63, null));
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onNextClicked(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.isButtonVisible.set(false);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, true, false, 2, null).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.getstarted.-$$Lambda$GetStartedViewModel$yjroOViThYJKaMTLIV_D9ABwmyw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel.m2848onNextClicked$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.getstarted.-$$Lambda$GetStartedViewModel$4MEoYBIazT9QcCz05-9kJ9ifChM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel.m2849onNextClicked$lambda1(view, this, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.getstarted.-$$Lambda$GetStartedViewModel$kN0G87LpJbNwO82Y-JQ2wyHPQrY
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel.m2850onNextClicked$lambda2();
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.getstarted.-$$Lambda$GetStartedViewModel$8coen33-v9CDZUppnUAR93Gk0rM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel.m2851onNextClicked$lambda3((java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onNextClicked$lambda-0, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2848onNextClicked$lambda0(powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics = this$0.biometricsViewModel.getBiometrics();
        return this$0.userAccountRepository.update(it.copy((1023 & 1) != 0 ? it.uid : 0L, (1023 & 2) != 0 ? it.enabled : false, (1023 & 4) != 0 ? it.name : null, (1023 & 8) != 0 ? it.email : null, (1023 & 16) != 0 ? it.password : null, (1023 & 32) != 0 ? it.age : biometrics.getAge(), (1023 & 64) != 0 ? it.height : kotlin.math.MathKt.roundToInt(this$0.userPrefsUtils.getMetricValue(biometrics.getHeight().getFirst(), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE).getFirst().floatValue()), (1023 & 128) != 0 ? it.weight : this$0.userPrefsUtils.getMetricValue(biometrics.getWeight().getFirst(), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE).getFirst().floatValue(), (1023 & 256) != 0 ? it.gender : biometrics.getGender(), (1023 & 512) != 0 ? it.shouldSync : false, (1023 & 1024) != 0 ? it.accountSettings : powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings.copy$default(it.getAccountSettings(), biometrics.getLanguage().getLanguageKey(), null, 0, 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onNextClicked$lambda-1, reason: not valid java name */
    public static final void m2849onNextClicked$lambda1(android.view.View this_onNextClicked, powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onNextClicked, "$this_onNextClicked");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.AppConfigPreferences.Companion companion = powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE;
        android.content.Context context = this_onNextClicked.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        if (!companion.getPermissionsShownFlag(context)) {
            androidx.fragment.app.FragmentManager fragmentManager = this$0.fragmentManagerWeakReference.get();
            if (fragmentManager == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
            return;
        }
        android.app.Activity activity = this$0.activityWeakReference.get();
        if (activity != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToPairingActivity(activity, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.ChooseProductScreen.INSTANCE);
        }
        android.app.Activity activity2 = this$0.activityWeakReference.get();
        if (activity2 == null) {
            return;
        }
        activity2.finish();
    }
}
