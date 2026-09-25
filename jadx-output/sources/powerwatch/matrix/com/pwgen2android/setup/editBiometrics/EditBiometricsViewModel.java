package powerwatch.matrix.com.pwgen2android.setup.editBiometrics;

/* JADX INFO: compiled from: EditBiometricsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0006\u0010\u001f\u001a\u00020\u001cR\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\n0\n0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/editBiometrics/EditBiometricsViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "activityContext", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "savePreferencesViewModel", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V", "biometricsViewModel", "Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;", "getBiometricsViewModel", "()Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;", "setBiometricsViewModel", "(Lpowerwatch/matrix/com/pwgen2android/setup/biometrics/BiometricsViewModel;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "showSaveProgress", "Landroidx/databinding/ObservableField;", "", "getShowSaveProgress", "()Landroidx/databinding/ObservableField;", "onBackClicked", "", "onCreateView", "context", "onSaveClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EditBiometricsViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel $$delegate_0;
    public powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel biometricsViewModel;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.$$delegate_0.getShowSaveProgress();
    }

    public /* synthetic */ EditBiometricsViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl savePreferencesViewModelImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userAccountRepository, userPrefsUtils, context, fragmentManager, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl(null, 1, null) : savePreferencesViewModelImpl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EditBiometricsViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context activityContext, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel) {
        super(activityContext, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePreferencesViewModel, "savePreferencesViewModel");
        this.userAccountRepository = userAccountRepository;
        this.userPrefsUtils = userPrefsUtils;
        this.$$delegate_0 = savePreferencesViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
    }

    public final powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel getBiometricsViewModel() {
        powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel biometricsViewModel = this.biometricsViewModel;
        if (biometricsViewModel != null) {
            return biometricsViewModel;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("biometricsViewModel");
        throw null;
    }

    public final void setBiometricsViewModel(powerwatch.matrix.com.pwgen2android.setup.biometrics.BiometricsViewModel biometricsViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricsViewModel, "<set-?>");
        this.biometricsViewModel = biometricsViewModel;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
        getBiometricsViewModel().getLanguageShown().set(false);
    }

    public final void onSaveClicked() {
        getShowSaveProgress().set(true);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, true, false, 2, null).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$EditBiometricsViewModel$lfjWNb5Lx8yrUF19nqbZJvlC0xk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel.m2820onSaveClicked$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$EditBiometricsViewModel$TcOrSl6k77mD-kiJb3KrDADhb50
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel.m2821onSaveClicked$lambda1(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$EditBiometricsViewModel$18iKqZ3ZhtychWRAhp6KR_lLndo
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel.m2822onSaveClicked$lambda2(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.editBiometrics.-$$Lambda$EditBiometricsViewModel$UWQ4V7OcEYEcsPCz7_eD_RWJNPk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel.m2823onSaveClicked$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-0, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2820onSaveClicked$lambda0(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.setup.biometrics.Biometrics biometrics = this$0.getBiometricsViewModel().getBiometrics();
        int age = biometrics.getAge();
        kotlin.Pair<java.lang.Integer, java.lang.String> pairComponent2 = biometrics.component2();
        kotlin.Pair<java.lang.Float, java.lang.String> pairComponent3 = biometrics.component3();
        java.lang.String gender = biometrics.getGender();
        biometrics.getLanguage();
        return this$0.userAccountRepository.update(it.copy((1023 & 1) != 0 ? it.uid : 0L, (1023 & 2) != 0 ? it.enabled : false, (1023 & 4) != 0 ? it.name : null, (1023 & 8) != 0 ? it.email : null, (1023 & 16) != 0 ? it.password : null, (1023 & 32) != 0 ? it.age : age, (1023 & 64) != 0 ? it.height : kotlin.math.MathKt.roundToInt(this$0.userPrefsUtils.getMetricValue(pairComponent2.getFirst(), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.HEIGHT.INSTANCE).getFirst().floatValue()), (1023 & 128) != 0 ? it.weight : this$0.userPrefsUtils.getMetricValue(pairComponent3.getFirst(), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.WEIGHT.INSTANCE).getFirst().floatValue(), (1023 & 256) != 0 ? it.gender : gender, (1023 & 512) != 0 ? it.shouldSync : false, (1023 & 1024) != 0 ? it.accountSettings : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-1, reason: not valid java name */
    public static final void m2821onSaveClicked$lambda1(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getShowSaveProgress().set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-2, reason: not valid java name */
    public static final void m2822onSaveClicked$lambda2(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-3, reason: not valid java name */
    public static final void m2823onSaveClicked$lambda3(powerwatch.matrix.com.pwgen2android.setup.editBiometrics.EditBiometricsViewModel this$0, java.lang.Throwable th) {
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
