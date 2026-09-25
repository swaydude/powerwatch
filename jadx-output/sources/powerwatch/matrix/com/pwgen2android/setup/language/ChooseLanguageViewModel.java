package powerwatch.matrix.com.pwgen2android.setup.language;

/* JADX INFO: compiled from: ChooseLanguageViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\fJ\b\u0010\"\u001a\u00020\u001fH\u0002R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\f0\f0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u000e0\u000e0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0015\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0018 \u0013*\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/language/ChooseLanguageViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "settingsLiteCommunicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;", "activityContext", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "savePreferencesViewModel", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/SettingsLiteCommunicator;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/setup/SavePreferencesViewModel;)V", "activityContextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "fragmentManagerWeakReference", "languagesField", "Landroidx/databinding/ObservableField;", "", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/runningcomponent/editActivity/chooseActityType/UIChooseItemView;", "getLanguagesField", "()Landroidx/databinding/ObservableField;", "showSaveProgress", "", "getShowSaveProgress", "onBackClicked", "", "onSaveClicked", "context", "reloadAfterLanguageChange", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChooseLanguageViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel $$delegate_0;
    private final java.lang.ref.WeakReference<android.content.Context> activityContextWeakReference;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;
    private final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView>> languagesField;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;

    @Override // powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getShowSaveProgress() {
        return this.$$delegate_0.getShowSaveProgress();
    }

    public /* synthetic */ ChooseLanguageViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userAccountRepository, languageController, rxBus, settingsLiteCommunicator, context, fragmentManager, (i & 64) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModelImpl(null, 1, null) : savePreferencesViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLanguageViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, powerwatch.matrix.com.pwgen2android.sdk.highlevel.SettingsLiteCommunicator settingsLiteCommunicator, android.content.Context activityContext, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.setup.SavePreferencesViewModel savePreferencesViewModel) {
        super(activityContext, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsLiteCommunicator, "settingsLiteCommunicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savePreferencesViewModel, "savePreferencesViewModel");
        this.userAccountRepository = userAccountRepository;
        this.languageController = languageController;
        this.rxBus = rxBus;
        this.settingsLiteCommunicator = settingsLiteCommunicator;
        this.$$delegate_0 = savePreferencesViewModel;
        java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> locales = languageController.getLocales();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(locales, 10));
        for (powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo : locales) {
            powerwatch.matrix.com.pwgen2android.utils.LanguageInfo appLanguage = this.languageController.getAppLanguage(activityContext);
            java.lang.String string = activityContext.getString(languageInfo.getLanguageDisplay());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(it.languageDisplay)");
            arrayList.add(new powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView(string, kotlin.jvm.internal.Intrinsics.areEqual(appLanguage.getLanguageKey(), languageInfo.getLanguageKey())));
        }
        this.languagesField = new androidx.databinding.ObservableField<>(arrayList);
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.activityContextWeakReference = new java.lang.ref.WeakReference<>(activityContext);
    }

    public final androidx.databinding.ObservableField<java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView>> getLanguagesField() {
        return this.languagesField;
    }

    @Override // powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel
    public void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    private final void reloadAfterLanguageChange() {
        android.content.Context activityContext = getActivityContext();
        powerwatch.matrix.com.pwgen2android.main.MainActivity mainActivity = activityContext instanceof powerwatch.matrix.com.pwgen2android.main.MainActivity ? (powerwatch.matrix.com.pwgen2android.main.MainActivity) activityContext : null;
        android.content.Intent intent = mainActivity != null ? mainActivity.getIntent() : null;
        if (mainActivity != null) {
            mainActivity.finish();
        }
        if (mainActivity == null) {
            return;
        }
        mainActivity.startActivity(intent);
    }

    public final void onSaveClicked(final android.content.Context context) {
        powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView uIChooseItemViewPrevious;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> list = this.languagesField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        java.util.ListIterator<powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            uIChooseItemViewPrevious = listIterator.previous();
            if (uIChooseItemViewPrevious.getChecked()) {
                final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView uIChooseItemView = uIChooseItemViewPrevious;
                getShowSaveProgress().set(true);
                getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, false, true, 1, null).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ChooseLanguageViewModel$UxUSXVMUsk1ox6Bd9I69MV2qPMY
                    @Override // io.reactivex.functions.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel.m2886onSaveClicked$lambda4(uIChooseItemView, this, context, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
                    }
                }).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ChooseLanguageViewModel$_uHFEZ9lIURCab--PaKw532MJyI
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel.m2887onSaveClicked$lambda5(this.f$0);
                    }
                }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).delay(700L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ChooseLanguageViewModel$gVl0oqSAv0vkPL3q8z0f5S-LnzE
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel.m2888onSaveClicked$lambda6(this.f$0);
                    }
                }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ChooseLanguageViewModel$aBkNUQ_CxsT6Lihp0_C-63NLjaE
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(java.lang.Object obj) {
                        powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel.m2889onSaveClicked$lambda7(this.f$0, (java.lang.Throwable) obj);
                    }
                }));
            }
        }
        uIChooseItemViewPrevious = null;
        final powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView uIChooseItemView2 = uIChooseItemViewPrevious;
        getShowSaveProgress().set(true);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, false, true, 1, null).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ChooseLanguageViewModel$UxUSXVMUsk1ox6Bd9I69MV2qPMY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel.m2886onSaveClicked$lambda4(uIChooseItemView2, this, context, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ChooseLanguageViewModel$_uHFEZ9lIURCab--PaKw532MJyI
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel.m2887onSaveClicked$lambda5(this.f$0);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).delay(700L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ChooseLanguageViewModel$gVl0oqSAv0vkPL3q8z0f5S-LnzE
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel.m2888onSaveClicked$lambda6(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.language.-$$Lambda$ChooseLanguageViewModel$aBkNUQ_CxsT6Lihp0_C-63NLjaE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel.m2889onSaveClicked$lambda7(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-4, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2886onSaveClicked$lambda4(powerwatch.matrix.com.pwgen2android.main.dashboard.runningcomponent.editActivity.chooseActityType.UIChooseItemView uIChooseItemView, powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfoPrevious;
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo defaultLanguageInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (uIChooseItemView == null) {
            defaultLanguageInfo = null;
        } else {
            java.util.List<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> locales = this$0.languageController.getLocales();
            java.util.ListIterator<powerwatch.matrix.com.pwgen2android.utils.LanguageInfo> listIterator = locales.listIterator(locales.size());
            do {
                if (!listIterator.hasPrevious()) {
                    languageInfoPrevious = null;
                    break;
                }
                languageInfoPrevious = listIterator.previous();
            } while (!kotlin.jvm.internal.Intrinsics.areEqual(context.getString(languageInfoPrevious.getLanguageDisplay()), uIChooseItemView.getName()));
            defaultLanguageInfo = languageInfoPrevious;
        }
        if (defaultLanguageInfo == null) {
            defaultLanguageInfo = powerwatch.matrix.com.pwgen2android.utils.LanguageControllerImpl.INSTANCE.getDefaultLanguageInfo();
        }
        powerwatch.matrix.com.pwgen2android.utils.LanguageInfo languageInfo = defaultLanguageInfo;
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.setIncomingCallString(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.getIncomingCallString(languageInfo.getLanguageKey()));
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.setMissedCallString(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.getMissedCallString(languageInfo.getLanguageKey()));
        return this$0.userAccountRepository.update(it.copy((1023 & 1) != 0 ? it.uid : 0L, (1023 & 2) != 0 ? it.enabled : false, (1023 & 4) != 0 ? it.name : null, (1023 & 8) != 0 ? it.email : null, (1023 & 16) != 0 ? it.password : null, (1023 & 32) != 0 ? it.age : 0, (1023 & 64) != 0 ? it.height : 0, (1023 & 128) != 0 ? it.weight : 0.0f, (1023 & 256) != 0 ? it.gender : null, (1023 & 512) != 0 ? it.shouldSync : false, (1023 & 1024) != 0 ? it.accountSettings : powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings.copy$default(it.getAccountSettings(), languageInfo.getLanguageKey(), null, 0, 6, null))).andThen(this$0.settingsLiteCommunicator.applySetting(new powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting.Language(languageInfo.getLocale(), null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-5, reason: not valid java name */
    public static final void m2887onSaveClicked$lambda5(powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.rxBus.send(powerwatch.matrix.com.pwgen2android.shared.LanguageChangedEvent.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-6, reason: not valid java name */
    public static final void m2888onSaveClicked$lambda6(powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.reloadAfterLanguageChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onSaveClicked$lambda-7, reason: not valid java name */
    public static final void m2889onSaveClicked$lambda7(powerwatch.matrix.com.pwgen2android.setup.language.ChooseLanguageViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.reloadAfterLanguageChange();
    }
}
