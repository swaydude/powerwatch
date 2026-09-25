package powerwatch.matrix.com.pwgen2android.setup.units;

/* JADX INFO: compiled from: ChooseUnitsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u001cJ\n\u0010\u001e\u001a\u00020\u001c*\u00020\u001fJ\n\u0010 \u001a\u00020\u001c*\u00020\u001fR\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00060\u00060\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/units/ChooseUnitsViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "activityContext", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "settingsLiteCommunicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "savePreferencesViewModel", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "metricChecked", "Landroidx/databinding/ObservableField;", "", "getMetricChecked", "()Landroidx/databinding/ObservableField;", "showSaveProgress", "getShowSaveProgress", "onBackClicked", "", "onSaveClicked", "onImperialChecked", "Landroid/view/View;", "onMetricChecked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChooseUnitsViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel $$delegate_0;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> metricChecked;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m2944_init_$lambda1(java.lang.Throwable th) {
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.$$delegate_0.getShowSaveProgress();
    }

    public /* synthetic */ ChooseUnitsViewModel(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fragmentManager, userPrefsUtils, userAccountRepository, settingsLiteCommunicator, rxBus, (i & 64) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl(null, 1, null) : savePreferencesViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChooseUnitsViewModel(android.content.Context activityContext, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel) {
        super(activityContext, null, 2, null == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsLiteCommunicator, "settingsLiteCommunicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePreferencesViewModel, "savePreferencesViewModel");
        this.userAccountRepository = userAccountRepository;
        this.settingsLiteCommunicator = settingsLiteCommunicator;
        this.rxBus = rxBus;
        this.$$delegate_0 = savePreferencesViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.metricChecked = new androidx.databinding.ObservableField<>(false);
        getCompositeDisposable().add(userPrefsUtils.isMetricsUsed().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.-$$Lambda$ChooseUnitsViewModel$hMRiQzXafiyfWGcFfq5_evG7DQU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel.m2943_init_$lambda0(this.f$0, (java.lang.Boolean) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.-$$Lambda$ChooseUnitsViewModel$lSajDM3DxLlIgkBu5339mMhI7BY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel.m2944_init_$lambda1((java.lang.Throwable) obj);
            }
        }));
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getMetricChecked() {
        return this.metricChecked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m2943_init_$lambda0(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel this$0, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMetricChecked().set(bool);
    }

    public final void onMetricChecked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.metricChecked.set(true);
    }

    public final void onImperialChecked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.metricChecked.set(false);
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

    public final void onSaveClicked() {
        getShowSaveProgress().set(true);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, true, false, 2, null).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.-$$Lambda$ChooseUnitsViewModel$dvnje4eh8uT1QAPNlkmBKbEZffg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel.m2946onSaveClicked$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.-$$Lambda$ChooseUnitsViewModel$g03d9u6jse1SJIChc0I2TuM_VX4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel.m2947onSaveClicked$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.-$$Lambda$ChooseUnitsViewModel$1uq8nZmkjmCtxgO-SPyk6ziAftg
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel.m2948onSaveClicked$lambda4(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.units.-$$Lambda$ChooseUnitsViewModel$VXTMG6p_uta83GlfsutOUdPVyEY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel.m2949onSaveClicked$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-2, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2946onSaveClicked$lambda2(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.Boolean bool = this$0.getMetricChecked().get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
        powerwatch.matrix.com.pwgen2android.shared.data.models.User userCopy = it.copy((1023 & 1) != 0 ? it.uid : 0L, (1023 & 2) != 0 ? it.enabled : false, (1023 & 4) != 0 ? it.name : null, (1023 & 8) != 0 ? it.email : null, (1023 & 16) != 0 ? it.password : null, (1023 & 32) != 0 ? it.age : 0, (1023 & 64) != 0 ? it.height : 0, (1023 & 128) != 0 ? it.weight : 0.0f, (1023 & 256) != 0 ? it.gender : null, (1023 & 512) != 0 ? it.shouldSync : false, (1023 & 1024) != 0 ? it.accountSettings : powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings.copy$default(it.getAccountSettings(), null, (bool.booleanValue() ? powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.METRIC.INSTANCE : powerwatch.matrix.com.pwgen2android.shared.data.models.UnitType.IMPERIAL.INSTANCE).getType(), 0, 5, null));
        return this$0.userAccountRepository.update(userCopy).andThen(this$0.settingsLiteCommunicator.applySetting(new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Units(userCopy, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-3, reason: not valid java name */
    public static final void m2947onSaveClicked$lambda3(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.DataReloadEvent.INSTANCE);
        this$0.getShowSaveProgress().set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-4, reason: not valid java name */
    public static final void m2948onSaveClicked$lambda4(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-5, reason: not valid java name */
    public static final void m2949onSaveClicked$lambda5(powerwatch.matrix.com.pwgen2android.setup.units.ChooseUnitsViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackClicked();
    }
}
