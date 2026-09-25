package powerwatch.matrix.com.pwgen2android.setup;

/* JADX INFO: compiled from: SetupActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "intent", "Landroid/content/Intent;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "stravaController", "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/content/Intent;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V", "hasPairedDevice", "", "isStravaIntent", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SetupActivityViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseActivityViewModel {
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupActivityViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, android.app.Activity activity, final androidx.fragment.app.FragmentManager fragmentManager, final android.content.Intent intent, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController) {
        super(languageController, activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaController, "stravaController");
        this.deviceRepository = deviceRepository;
        this.stravaController = stravaController;
        java.lang.String navigation = powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.getNavigation(intent);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(navigation, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationFragment.None.INSTANCE.getClassName())) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.fillBackStack(fragmentManager, powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.getFragmentsToPush(navigation), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container);
            return;
        }
        if (isStravaIntent(intent)) {
            powerwatch.matrix.com.pwgen2android.strava.StravaAuthInfo intent2 = stravaController.parseIntent(intent);
            kotlin.jvm.internal.Intrinsics.checkNotNull(intent2);
            stravaController.getAccessAndRefreshToken(intent2);
            if (hasPairedDevice()) {
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToMainActivity$default(activity, null, true, 1, null);
                activity.finish();
                return;
            } else {
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.permissions.thirdparty.ThirdPartyPermissionFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 8, null);
                return;
            }
        }
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(userAccountRepository, false, true, 1, null).subscribeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.-$$Lambda$SetupActivityViewModel$tl0ahNgLaIjQoN5huKxlofSrN2w
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel.m2790_init_$lambda0(fragmentManager, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.-$$Lambda$SetupActivityViewModel$dDXDPBvZvhIAeoyivLHWoD8nTGs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.SetupActivityViewModel.m2791_init_$lambda1(fragmentManager, intent, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m2790_init_$lambda0(androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "$fragmentManager");
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 8, null);
        if (user.getEnabled()) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment.INSTANCE.newInstance(user.getEmail()), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m2791_init_$lambda1(androidx.fragment.app.FragmentManager fragmentManager, android.content.Intent intent, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "$fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "$intent");
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.welcome.WelcomeScreenFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 8, null);
        if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.setup.DeepLinkConstantsKt.getVERIFY_URL_SCHEME(), intent.getAction())) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment.INSTANCE.newInstance(""), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, true, null, 8, null);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.setup.DeepLinkConstantsKt.getRESET_PERFORMED_URL_SCHEME(), intent.getAction())) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.signin.SignInFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, true, null, 8, null);
        }
    }

    public final boolean isStravaIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        return this.stravaController.isValidIntent(intent);
    }

    public final boolean hasPairedDevice() {
        return !this.deviceRepository.isEmpty();
    }
}
