package powerwatch.matrix.com.pwgen2android.setup.createaccount;

/* JADX INFO: compiled from: CreateAccountViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010.\u001a\u00020\u0019H\u0096\u0001J\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0016J\n\u00104\u001a\u000200*\u000205J\n\u00106\u001a\u000200*\u000205J\n\u00107\u001a\u000200*\u000205R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u001f\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00070\u00070 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00190\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u001f\u0010#\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00190\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001f\u0010(\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00190\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010*\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017R\u001f\u0010,\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "emailValidator", "Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;", "passwordValidator", "Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;", "networkInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;", "bugfenderConfig", "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;", "loginFlowBaseViewModel", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V", "confirmPasswordField", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getConfirmPasswordField", "()Landroidx/databinding/ObservableField;", "displayNetworkError", "", "getDisplayNetworkError", "emailField", "getEmailField", "errorMessage", "getErrorMessage", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "goToLoginLinkDisplayed", "getGoToLoginLinkDisplayed", "isButtonVisible", "isFromLogin", "()Z", "setFromLogin", "(Z)V", "licenceAccepted", "getLicenceAccepted", "nameField", "getNameField", "passwordField", "getPasswordField", "checkAndDisplayNetworkError", "onBackClicked", "", "onCreateView", "context", "Landroid/content/Context;", "goToLogin", "Landroid/view/View;", "onCreateAccountClicked", "onTermsAndConditionsClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CreateAccountViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel {
    private final powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig;
    private final androidx.databinding.ObservableField<java.lang.String> confirmPasswordField;
    private final androidx.databinding.ObservableField<java.lang.String> emailField;
    private final powerwatch.matrix.com.pwgen2android.utils.EmailValidator emailValidator;
    private final androidx.databinding.ObservableField<java.lang.String> errorMessage;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> goToLoginLinkDisplayed;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible;
    private boolean isFromLogin;
    private final androidx.databinding.ObservableField<java.lang.Boolean> licenceAccepted;
    private final powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel;
    private final androidx.databinding.ObservableField<java.lang.String> nameField;
    private final androidx.databinding.ObservableField<java.lang.String> passwordField;
    private final powerwatch.matrix.com.pwgen2android.utils.PasswordValidator passwordValidator;
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

    public /* synthetic */ CreateAccountViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.utils.EmailValidator emailValidator, powerwatch.matrix.com.pwgen2android.utils.PasswordValidator passwordValidator, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider, powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userAccountRepository, fragmentManager, emailValidator, passwordValidator, networkInfoProvider, bugfenderConfig, (i & 64) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModelImpl(networkInfoProvider) : loginFlowBaseViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateAccountViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, androidx.fragment.app.FragmentManager fragmentManager, powerwatch.matrix.com.pwgen2android.utils.EmailValidator emailValidator, powerwatch.matrix.com.pwgen2android.utils.PasswordValidator passwordValidator, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider, powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfig, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailValidator, "emailValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordValidator, "passwordValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bugfenderConfig, "bugfenderConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginFlowBaseViewModel, "loginFlowBaseViewModel");
        this.userAccountRepository = userAccountRepository;
        this.emailValidator = emailValidator;
        this.passwordValidator = passwordValidator;
        this.bugfenderConfig = bugfenderConfig;
        this.loginFlowBaseViewModel = loginFlowBaseViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.emailField = new androidx.databinding.ObservableField<>("");
        this.passwordField = new androidx.databinding.ObservableField<>("");
        this.confirmPasswordField = new androidx.databinding.ObservableField<>("");
        this.nameField = new androidx.databinding.ObservableField<>("");
        this.isButtonVisible = new androidx.databinding.ObservableField<>(true);
        this.errorMessage = new androidx.databinding.ObservableField<>("");
        this.licenceAccepted = new androidx.databinding.ObservableField<>(false);
        this.goToLoginLinkDisplayed = new androidx.databinding.ObservableField<>(true);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getEmailField() {
        return this.emailField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getPasswordField() {
        return this.passwordField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getConfirmPasswordField() {
        return this.confirmPasswordField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getNameField() {
        return this.nameField;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible() {
        return this.isButtonVisible;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getErrorMessage() {
        return this.errorMessage;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getLicenceAccepted() {
        return this.licenceAccepted;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getGoToLoginLinkDisplayed() {
        return this.goToLoginLinkDisplayed;
    }

    /* JADX INFO: renamed from: isFromLogin, reason: from getter */
    public final boolean getIsFromLogin() {
        return this.isFromLogin;
    }

    public final void setFromLogin(boolean z) {
        this.isFromLogin = z;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.BaseViewModel
    public void onCreateView(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super.onCreateView(context);
    }

    public final void onCreateAccountClicked(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.errorMessage.set("");
        if (!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.licenceAccepted.get(), (java.lang.Object) true)) {
            android.widget.Toast.makeText(view.getContext(), view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.accept_licence_page), 0).show();
            return;
        }
        if (!this.emailValidator.isEmailValid(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModelKt.getValue(this.emailField))) {
            this.errorMessage.set(view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.enter_valid_email));
            return;
        }
        java.lang.String str = this.passwordField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        java.lang.String str2 = this.confirmPasswordField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        if (!this.passwordValidator.isPasswordValid(str)) {
            this.errorMessage.set(view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.password_too_short));
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, str2)) {
            this.errorMessage.set(view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.passwords_mismatch));
            return;
        }
        if (checkAndDisplayNetworkError()) {
            final powerwatch.matrix.com.pwgen2android.shared.data.models.User user = new powerwatch.matrix.com.pwgen2android.shared.data.models.User(0L, false, powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModelKt.getValue(this.nameField), powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModelKt.getValue(this.emailField), powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModelKt.getValue(this.passwordField), 0, 0, 0.0f, null, false, null, 2019, null);
            this.isButtonVisible.set(false);
            getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddRepository.DefaultImpls.save$default(this.userAccountRepository, user, false, 2, null).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.createaccount.-$$Lambda$CreateAccountViewModel$J_gw4AaOZ1stZV6EDLHRGLXnxX0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel.m2814onCreateAccountClicked$lambda0(user, this);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.createaccount.-$$Lambda$CreateAccountViewModel$Zh4H3aGETIUmAklYg6eUcSvteNM
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel.m2815onCreateAccountClicked$lambda1(this.f$0, view, (java.lang.Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateAccountClicked$lambda-0, reason: not valid java name */
    public static final void m2814onCreateAccountClicked$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.models.User user, powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "$user");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment verifyAccountScreenFragmentNewInstance = powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountScreenFragment.INSTANCE.newInstance(user.getEmail());
        androidx.fragment.app.FragmentManager fragmentManager = this$0.fragmentManagerWeakReference.get();
        if (fragmentManager != null) {
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, verifyAccountScreenFragmentNewInstance, powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
        }
        this$0.bugfenderConfig.setUserEmail(user.getEmail());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreateAccountClicked$lambda-1, reason: not valid java name */
    public static final void m2815onCreateAccountClicked$lambda1(powerwatch.matrix.com.pwgen2android.setup.createaccount.CreateAccountViewModel this$0, android.view.View this_onCreateAccountClicked, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onCreateAccountClicked, "$this_onCreateAccountClicked");
        this$0.isButtonVisible().set(true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitErrorResponseRetrofitResponse = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorResolverKt.retrofitResponse(it);
        powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType cloudErrorType = retrofitErrorResponseRetrofitResponse == null ? null : retrofitErrorResponseRetrofitResponse.getCloudErrorType();
        if (kotlin.jvm.internal.Intrinsics.areEqual(cloudErrorType, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.AccountAlreadyExists.INSTANCE)) {
            this$0.getErrorMessage().set(this_onCreateAccountClicked.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.email_exists));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(cloudErrorType, powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.PasswordEmptyChar.INSTANCE)) {
            this$0.getErrorMessage().set("Password contains a whitespace character.");
        } else {
            this$0.getErrorMessage().set("Unknown error occurred, please try again.");
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Cloud error during account creation occurred: Error type is: ", cloudErrorType), it, null, 4, null);
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }

    public final void onTermsAndConditionsClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.createaccount.LicencePageFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
    }

    public final void goToLogin(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        if (this.isFromLogin) {
            androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
            if (fragmentManager == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.popBackStackAllowingStateLoss(fragmentManager);
            return;
        }
        androidx.fragment.app.FragmentManager fragmentManager2 = this.fragmentManagerWeakReference.get();
        if (fragmentManager2 == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager2, powerwatch.matrix.com.pwgen2android.setup.signin.SignInFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
    }
}
