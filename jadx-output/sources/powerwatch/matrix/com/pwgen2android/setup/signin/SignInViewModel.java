package powerwatch.matrix.com.pwgen2android.setup.signin;

/* JADX INFO: compiled from: SignInViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BO\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0002\u0010\u0015J\t\u0010'\u001a\u00020\u001bH\u0096\u0001J\u0006\u0010(\u001a\u00020)J\n\u0010*\u001a\u00020)*\u00020+J\n\u0010,\u001a\u00020)*\u00020+J\n\u0010-\u001a\u00020)*\u00020+R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\r0\r0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001f0\u001f0\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001f0\u001f0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u000b0\u000b0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010$\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001b0\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010%\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u001f0\u001f0\u001a¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "loginCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "activity", "Landroid/app/Activity;", "emailValidator", "Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;", "networkInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;", "bugfenderConfig", "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;", "loginFlowBaseViewModel", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "displayNetworkError", "Landroidx/databinding/ObservableField;", "", "getDisplayNetworkError", "()Landroidx/databinding/ObservableField;", "emailField", "", "getEmailField", "errorMessage", "getErrorMessage", "fragmentManagerWeakReference", "isButtonVisible", "passwordField", "getPasswordField", "checkAndDisplayNetworkError", "onBackClicked", "", "onCreateAccountClicked", "Landroid/view/View;", "onForgotPasswordClicked", "onLoginClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SignInViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig;
    private final java.lang.ref.WeakReference<android.app.Activity> contextWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final androidx.databinding.ObservableField<java.lang.String> emailField;
    private final powerwatch.matrix.com.pwgen2android.utils.EmailValidator emailValidator;
    private final androidx.databinding.ObservableField<java.lang.String> errorMessage;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService;
    private final powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel;
    private final powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider;
    private final androidx.databinding.ObservableField<java.lang.String> passwordField;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;

    @Override // powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel
    public boolean checkAndDisplayNetworkError() {
        return this.loginFlowBaseViewModel.checkAndDisplayNetworkError();
    }

    @Override // powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel
    public androidx.databinding.ObservableField<java.lang.Boolean> getDisplayNetworkError() {
        return this.loginFlowBaseViewModel.getDisplayNetworkError();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public /* synthetic */ SignInViewModel(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, powerwatch.matrix.com.pwgen2android.utils.EmailValidator emailValidator, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider, powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(loginCloudService, deviceRepository, userAccountRepository, fragmentManager, activity, emailValidator, networkInfoProvider, bugfenderConfig, (i & 256) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModelImpl(networkInfoProvider) : loginFlowBaseViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel(powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, powerwatch.matrix.com.pwgen2android.utils.EmailValidator emailValidator, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider, powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginCloudService, "loginCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailValidator, "emailValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bugfenderConfig, "bugfenderConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginFlowBaseViewModel, "loginFlowBaseViewModel");
        this.loginCloudService = loginCloudService;
        this.deviceRepository = deviceRepository;
        this.userAccountRepository = userAccountRepository;
        this.emailValidator = emailValidator;
        this.networkInfoProvider = networkInfoProvider;
        this.bugfenderConfig = bugfenderConfig;
        this.loginFlowBaseViewModel = loginFlowBaseViewModel;
        this.contextWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.isButtonVisible = new androidx.databinding.ObservableField<>(true);
        this.errorMessage = new androidx.databinding.ObservableField<>("");
        this.emailField = new androidx.databinding.ObservableField<>("");
        this.passwordField = new androidx.databinding.ObservableField<>("");
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible() {
        return this.isButtonVisible;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getErrorMessage() {
        return this.errorMessage;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getEmailField() {
        return this.emailField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getPasswordField() {
        return this.passwordField;
    }

    public final void onLoginClicked(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (!this.emailValidator.isEmailValid(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModelKt.getValue(this.emailField))) {
            this.errorMessage.set(view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.enter_valid_email));
            return;
        }
        if (checkAndDisplayNetworkError()) {
            this.isButtonVisible.set(false);
            this.errorMessage.set("");
            io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
            powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService = this.loginCloudService;
            java.lang.String str = this.emailField.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            java.lang.String str2 = this.passwordField.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            compositeDisposable.add(loginCloudService.login(str, str2).doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.signin.-$$Lambda$SignInViewModel$TrtqFqKDWHYuKUH9m7GG3RpGOq4
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel.m2936onLoginClicked$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
                }
            }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.signin.-$$Lambda$SignInViewModel$o3H1IVouxXkHVWyyt0-xTmE0F6Q
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel.m2937onLoginClicked$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
                }
            }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.signin.-$$Lambda$SignInViewModel$WqS7VfORxoTrh-YErKkdgk28F3w
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel.m2938onLoginClicked$lambda2(this.f$0, view, (java.util.List) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.signin.-$$Lambda$SignInViewModel$FDFCyAQpb6oOFR4q1B_jeR4_3Cs
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel.m2939onLoginClicked$lambda3(this.f$0, view, (java.lang.Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLoginClicked$lambda-0, reason: not valid java name */
    public static final void m2936onLoginClicked$lambda0(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.bugfenderConfig.setUserEmail(user.getEmail());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLoginClicked$lambda-1, reason: not valid java name */
    public static final io.reactivex.SingleSource m2937onLoginClicked$lambda1(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this$0.deviceRepository, null, false, 1, null).firstOrError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLoginClicked$lambda-2, reason: not valid java name */
    public static final void m2938onLoginClicked$lambda2(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel this$0, android.view.View this_onLoginClicked, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onLoginClicked, "$this_onLoginClicked");
        this$0.getErrorMessage().set("");
        android.app.Activity activity = this$0.contextWeakReference.get();
        powerwatch.matrix.com.pwgen2android.AppConfigPreferences.Companion companion = powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE;
        android.content.Context context = this_onLoginClicked.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        if (!companion.getPermissionsShownFlag(context)) {
            androidx.fragment.app.FragmentManager fragmentManager = this$0.fragmentManagerWeakReference.get();
            if (fragmentManager != null) {
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.popBackStackAllowingStateLoss(fragmentManager);
            }
            androidx.fragment.app.FragmentManager fragmentManager2 = this$0.fragmentManagerWeakReference.get();
            if (fragmentManager2 == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager2, powerwatch.matrix.com.pwgen2android.setup.permissions.PermissionInfoFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
            return;
        }
        if (this$0.deviceRepository.isEmpty()) {
            if (activity != null) {
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToPairingActivity$default(activity, null, 1, null);
            }
        } else if (activity != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.goToMainActivity$default(activity, null, false, 3, null);
        }
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLoginClicked$lambda-3, reason: not valid java name */
    public static final void m2939onLoginClicked$lambda3(powerwatch.matrix.com.pwgen2android.setup.signin.SignInViewModel this$0, android.view.View this_onLoginClicked, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onLoginClicked, "$this_onLoginClicked");
        this$0.isButtonVisible().set(true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitErrorResponseRetrofitResponse = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorResolverKt.retrofitResponse(it);
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType cloudErrorType = retrofitErrorResponseRetrofitResponse == null ? null : retrofitErrorResponseRetrofitResponse.getCloudErrorType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(cloudErrorType, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.MigrationRequired.INSTANCE)) {
            androidx.databinding.ObservableField<java.lang.String> errorMessage = this$0.getErrorMessage();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String string = this_onLoginClicked.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.password_migration_required);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.password_migration_required)");
            java.lang.String str = this$0.getEmailField().get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            java.lang.String str2 = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
            errorMessage.set(str2);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(cloudErrorType, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.BadCredentials.INSTANCE)) {
            this$0.getErrorMessage().set(this_onLoginClicked.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.login_pass_mismatch));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(cloudErrorType, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.UserNotEnabled.INSTANCE)) {
            androidx.fragment.app.FragmentManager fragmentManager = this$0.fragmentManagerWeakReference.get();
            if (fragmentManager != null) {
                powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment.Companion companion = powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment.INSTANCE;
                java.lang.String str3 = this$0.getEmailField().get();
                kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
                powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, companion.newInstance(str3), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
            }
        } else {
            this$0.getErrorMessage().set(this_onLoginClicked.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.server_unknown_error));
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Cloud error during login occurred: Error type is: ", cloudErrorType), it, null, 4, null);
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        java.lang.Integer numValueOf = fragmentManager == null ? null : java.lang.Integer.valueOf(fragmentManager.getBackStackEntryCount());
        if (numValueOf != null && numValueOf.intValue() == 0) {
            android.app.Activity activity = this.contextWeakReference.get();
            if (activity == null) {
                return;
            }
            activity.finish();
            return;
        }
        androidx.fragment.app.FragmentManager fragmentManager2 = this.fragmentManagerWeakReference.get();
        if (fragmentManager2 == null) {
            return;
        }
        fragmentManager2.popBackStack();
    }

    public final void onCreateAccountClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountFragment createAccountFragmentNewInstance = powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountFragment.INSTANCE.newInstance(true);
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, createAccountFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
    }

    public final void onForgotPasswordClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordFragment forgotPasswordFragmentNewInstance = powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordFragment.INSTANCE.newInstance();
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, forgotPasswordFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
    }
}
