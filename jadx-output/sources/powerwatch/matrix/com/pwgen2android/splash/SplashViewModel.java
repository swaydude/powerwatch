package powerwatch.matrix.com.pwgen2android.splash;

/* JADX INFO: compiled from: SplashViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;", "loginCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "activity", "Landroid/app/Activity;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SplashViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseActivityViewModel {
    private final android.app.Activity activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashViewModel(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, android.app.Activity activity) {
        super(languageController, activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginCloudService, "loginCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        final boolean zIsLoggedIn = loginCloudService.isLoggedIn();
        final boolean z = !deviceRepository.isEmpty();
        getCompositeDisposable().add(io.reactivex.Single.timer(800L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.splash.-$$Lambda$SplashViewModel$EBG9-twwgjyGlAw82B10-RfAMrg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.splash.SplashViewModel.m3624_init_$lambda0(z, zIsLoggedIn, this, (java.lang.Long) obj);
            }
        }));
    }

    public final android.app.Activity getActivity() {
        return this.activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m3624_init_$lambda0(boolean z, boolean z2, powerwatch.matrix.com.pwgen2android.splash.SplashViewModel this$0, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z && z2) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToMainActivity$default(this$0.getActivity(), null, false, 3, null);
        } else if (!z2) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToSetupActivity$default(this$0.getActivity(), null, 1, null);
        } else {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToPairingActivity$default(this$0.getActivity(), null, 1, null);
        }
        this$0.getActivity().finish();
    }
}
