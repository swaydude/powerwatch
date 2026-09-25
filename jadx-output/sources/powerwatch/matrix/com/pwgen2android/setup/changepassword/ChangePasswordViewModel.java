package powerwatch.matrix.com.pwgen2android.setup.changepassword;

/* JADX INFO: compiled from: ChangePasswordViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010$\u001a\u00020\u0017H\u0096\u0001J\b\u0010%\u001a\u00020&H\u0016J\n\u0010'\u001a\u00020&*\u00020(R\u001f\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\t0\t0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00170\u00170\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001f\u0010 \u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00170\u00170\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;", "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "networkInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "activity", "Landroid/app/Activity;", "passwordValidator", "Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;", "loginFlowBaseViewModel", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V", "confirmPasswordField", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getConfirmPasswordField", "()Landroidx/databinding/ObservableField;", "displayNetworkError", "", "getDisplayNetworkError", "errorMessage", "getErrorMessage", "fragmentManagerWeakReference", "Ljava/lang/ref/WeakReference;", "isButtonVisible", "oldPasswordField", "getOldPasswordField", "passwordField", "getPasswordField", "responseSuccess", "getResponseSuccess", "checkAndDisplayNetworkError", "onBackClicked", "", "onChangePasswordClicked", "Landroid/view/View;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChangePasswordViewModel extends powerwatch.matrix.com.pwgen2android.main.MainDeepBaseViewModel implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel {
    private final androidx.databinding.ObservableField<java.lang.String> confirmPasswordField;
    private final androidx.databinding.ObservableField<java.lang.String> errorMessage;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible;
    private final powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel;
    private final androidx.databinding.ObservableField<java.lang.String> oldPasswordField;
    private final androidx.databinding.ObservableField<java.lang.String> passwordField;
    private final powerwatch.matrix.com.pwgen2android.utils.PasswordValidator passwordValidator;
    private final androidx.databinding.ObservableField<java.lang.Boolean> responseSuccess;
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

    public /* synthetic */ ChangePasswordViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider, androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, powerwatch.matrix.com.pwgen2android.utils.PasswordValidator passwordValidator, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModelImpl loginFlowBaseViewModelImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userAccountRepository, networkInfoProvider, fragmentManager, activity, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.utils.PasswordValidator() : passwordValidator, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModelImpl(networkInfoProvider) : loginFlowBaseViewModelImpl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChangePasswordViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider, androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, powerwatch.matrix.com.pwgen2android.utils.PasswordValidator passwordValidator, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel) {
        super(activity, null, 2, null == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordValidator, "passwordValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginFlowBaseViewModel, "loginFlowBaseViewModel");
        this.userAccountRepository = userAccountRepository;
        this.passwordValidator = passwordValidator;
        this.loginFlowBaseViewModel = loginFlowBaseViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.oldPasswordField = new androidx.databinding.ObservableField<>("");
        this.passwordField = new androidx.databinding.ObservableField<>("");
        this.confirmPasswordField = new androidx.databinding.ObservableField<>("");
        this.isButtonVisible = new androidx.databinding.ObservableField<>(true);
        this.errorMessage = new androidx.databinding.ObservableField<>("");
        this.responseSuccess = new androidx.databinding.ObservableField<>(false);
    }

    public final androidx.databinding.ObservableField<java.lang.String> getOldPasswordField() {
        return this.oldPasswordField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getPasswordField() {
        return this.passwordField;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getConfirmPasswordField() {
        return this.confirmPasswordField;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible() {
        return this.isButtonVisible;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getErrorMessage() {
        return this.errorMessage;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> getResponseSuccess() {
        return this.responseSuccess;
    }

    public final void onChangePasswordClicked(final android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        java.lang.String str = this.oldPasswordField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        java.lang.String str2 = this.passwordField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
        java.lang.String str3 = this.confirmPasswordField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
        if (!this.passwordValidator.isPasswordValid(str2)) {
            this.errorMessage.set(view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.password_too_short));
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, str3)) {
            this.errorMessage.set(view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.passwords_mismatch));
        } else if (checkAndDisplayNetworkError()) {
            this.isButtonVisible.set(false);
            getCompositeDisposable().add(this.userAccountRepository.resetPassword(str, str2).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.changepassword.-$$Lambda$ChangePasswordViewModel$RTwWPprs1j4GNb-3Gp0AkxlldjA
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel.m2799onChangePasswordClicked$lambda0(this.f$0, (java.lang.Throwable) obj);
                }
            }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.changepassword.-$$Lambda$ChangePasswordViewModel$gxVbzZpvY6GdHf8EwsGJ4niVMh8
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel.m2800onChangePasswordClicked$lambda1(this.f$0);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.changepassword.-$$Lambda$ChangePasswordViewModel$qGyX_aZVg_-KMohI_nQpOQMC6kU
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel.m2801onChangePasswordClicked$lambda2(this.f$0, view, (java.lang.Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onChangePasswordClicked$lambda-0, reason: not valid java name */
    public static final void m2799onChangePasswordClicked$lambda0(powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isButtonVisible().set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onChangePasswordClicked$lambda-1, reason: not valid java name */
    public static final void m2800onChangePasswordClicked$lambda1(powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getResponseSuccess().set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onChangePasswordClicked$lambda-2, reason: not valid java name */
    public static final void m2801onChangePasswordClicked$lambda2(powerwatch.matrix.com.pwgen2android.setup.changepassword.ChangePasswordViewModel this$0, android.view.View this_onChangePasswordClicked, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this_onChangePasswordClicked, "$this_onChangePasswordClicked");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitErrorResponseRetrofitResponse = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorResolverKt.retrofitResponse(it);
        if (kotlin.jvm.internal.Intrinsics.areEqual(retrofitErrorResponseRetrofitResponse == null ? null : retrofitErrorResponseRetrofitResponse.getCloudErrorType(), powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.PasswordNotMatch.INSTANCE)) {
            this$0.getErrorMessage().set(this_onChangePasswordClicked.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.old_password_not_match));
        } else {
            this$0.getErrorMessage().set(this_onChangePasswordClicked.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.change_password_not_possible));
        }
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
