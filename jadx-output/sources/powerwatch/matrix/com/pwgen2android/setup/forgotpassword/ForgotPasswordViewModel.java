package powerwatch.matrix.com.pwgen2android.setup.forgotpassword;

/* JADX INFO: compiled from: ForgotPasswordViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0002\u0010\u0010J\t\u0010$\u001a\u00020\u0016H\u0096\u0001J\b\u0010%\u001a\u00020&H\u0002J\u0006\u0010'\u001a\u00020&J\n\u0010(\u001a\u00020&*\u00020)R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\n0\n0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u001a0\u001a0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u001a0\u001a0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u000e\u0010\u001e\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\b0\b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\f0\f0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\"\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00160\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "networkInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "activityContext", "Landroid/content/Context;", "fragment", "Landroidx/fragment/app/Fragment;", "emailValidator", "Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;", "loginFlowBaseViewModel", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V", "activityContextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "displayNetworkError", "Landroidx/databinding/ObservableField;", "", "getDisplayNetworkError", "()Landroidx/databinding/ObservableField;", "emailField", "", "getEmailField", "errorMessage", "getErrorMessage", "forgotPasswordEmailErrorText", "fragmentManagerWeakReference", "fragmentWeakReference", "isButtonVisible", "responseSuccess", "getResponseSuccess", "checkAndDisplayNetworkError", "hideKeyboard", "", "onBackClicked", "onForgotPasswordClicked", "Landroid/view/View;", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ForgotPasswordViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel implements powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel.class).getSimpleName();
    private final java.lang.ref.WeakReference<android.content.Context> activityContextWeakReference;
    private final androidx.databinding.ObservableField<java.lang.String> emailField;
    private final powerwatch.matrix.com.pwgen2android.utils.EmailValidator emailValidator;
    private final androidx.databinding.ObservableField<java.lang.String> errorMessage;
    private final java.lang.String forgotPasswordEmailErrorText;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final java.lang.ref.WeakReference<androidx.fragment.app.Fragment> fragmentWeakReference;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible;
    private final powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel;
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

    public /* synthetic */ ForgotPasswordViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context context, androidx.fragment.app.Fragment fragment, powerwatch.matrix.com.pwgen2android.utils.EmailValidator emailValidator, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(userAccountRepository, networkInfoProvider, fragmentManager, context, fragment, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.utils.EmailValidator() : emailValidator, (i & 64) != 0 ? new powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModelImpl(networkInfoProvider) : loginFlowBaseViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgotPasswordViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.host.NetworkInfoProvider networkInfoProvider, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context activityContext, androidx.fragment.app.Fragment fragment, powerwatch.matrix.com.pwgen2android.utils.EmailValidator emailValidator, powerwatch.matrix.com.pwgen2android.setup.LoginFlowBaseViewModel loginFlowBaseViewModel) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailValidator, "emailValidator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginFlowBaseViewModel, "loginFlowBaseViewModel");
        this.userAccountRepository = userAccountRepository;
        this.emailValidator = emailValidator;
        this.loginFlowBaseViewModel = loginFlowBaseViewModel;
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        this.activityContextWeakReference = new java.lang.ref.WeakReference<>(activityContext);
        this.fragmentWeakReference = new java.lang.ref.WeakReference<>(fragment);
        java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.resend_email_error_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(R.string.resend_email_error_message)");
        this.forgotPasswordEmailErrorText = string;
        this.isButtonVisible = new androidx.databinding.ObservableField<>(true);
        this.errorMessage = new androidx.databinding.ObservableField<>("");
        this.emailField = new androidx.databinding.ObservableField<>("");
        this.responseSuccess = new androidx.databinding.ObservableField<>(false);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(userAccountRepository, false, true, 1, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.forgotpassword.-$$Lambda$ForgotPasswordViewModel$MDRo9DKHtOKwvu7Zcke2wKTHH-M
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel.m2838_init_$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.forgotpassword.-$$Lambda$ForgotPasswordViewModel$2W4zBaQUFT8b1Z_N10wVNN5ehaI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel.m2839_init_$lambda1((java.lang.Throwable) obj);
            }
        }));
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

    public final androidx.databinding.ObservableField<java.lang.Boolean> getResponseSuccess() {
        return this.responseSuccess;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m2838_init_$lambda0(powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getEmailField().set(user.getEmail());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m2839_init_$lambda1(java.lang.Throwable th) {
        android.util.Log.e(TAG, "User doesn't exist, emailField field is empty.");
        th.printStackTrace();
    }

    public final void onForgotPasswordClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.errorMessage.set("");
        java.lang.String str = this.emailField.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        if (!this.emailValidator.isEmailValid(str)) {
            this.errorMessage.set(view.getContext().getString(powerwatch.matrix.com.pwgen2android.R.string.enter_valid_email));
            hideKeyboard();
        } else if (checkAndDisplayNetworkError()) {
            this.isButtonVisible.set(false);
            io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
            powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository = this.userAccountRepository;
            java.lang.String str2 = this.emailField.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
            compositeDisposable.add(userAccountRepository.forgotPassword(str2).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.forgotpassword.-$$Lambda$ForgotPasswordViewModel$L_SpnI7M8tH4DQdj6G4cTthySNk
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel.m2841onForgotPasswordClicked$lambda2(this.f$0, (java.lang.Throwable) obj);
                }
            }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.forgotpassword.-$$Lambda$ForgotPasswordViewModel$sPwFoCLHYmZDoiipHvUvzZ6RYEU
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel.m2842onForgotPasswordClicked$lambda3(this.f$0);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.forgotpassword.-$$Lambda$ForgotPasswordViewModel$Qfr070rahV1QTPHh2DhQix7LDGU
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel.m2843onForgotPasswordClicked$lambda4(this.f$0, (java.lang.Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onForgotPasswordClicked$lambda-2, reason: not valid java name */
    public static final void m2841onForgotPasswordClicked$lambda2(powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isButtonVisible().set(true);
        this$0.hideKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onForgotPasswordClicked$lambda-3, reason: not valid java name */
    public static final void m2842onForgotPasswordClicked$lambda3(powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getResponseSuccess().set(true);
        android.util.Log.d(TAG, "ForgotPassword request success.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onForgotPasswordClicked$lambda-4, reason: not valid java name */
    public static final void m2843onForgotPasswordClicked$lambda4(powerwatch.matrix.com.pwgen2android.setup.forgotpassword.ForgotPasswordViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getErrorMessage().set(this$0.forgotPasswordEmailErrorText);
        android.util.Log.e(TAG, "ForgotPassword request error.");
        th.printStackTrace();
    }

    private final void hideKeyboard() {
        android.content.Context context = this.activityContextWeakReference.get();
        androidx.fragment.app.Fragment fragment = this.fragmentWeakReference.get();
        android.view.View view = fragment == null ? null : fragment.getView();
        if (context == null || view == null) {
            return;
        }
        android.content.Context context2 = this.activityContextWeakReference.get();
        java.lang.Object systemService = context2 != null ? context2.getSystemService("input_method") : null;
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }
}
