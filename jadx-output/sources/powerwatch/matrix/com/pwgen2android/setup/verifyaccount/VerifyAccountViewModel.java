package powerwatch.matrix.com.pwgen2android.setup.verifyaccount;

/* JADX INFO: compiled from: VerifyAccountViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020!H\u0002J\n\u0010#\u001a\u00020!*\u00020$J\n\u0010%\u001a\u00020!*\u00020$R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\t0\t0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00140\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001f\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u001d0\u001d0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;", "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;", "userAccountRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;", "loginCloudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "appContext", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;)V", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "email", "Landroidx/databinding/ObservableField;", "", "getEmail", "()Landroidx/databinding/ObservableField;", "errorMessage", "getErrorMessage", "fragmentManagerWeakReference", "infoMessage", "getInfoMessage", "isButtonVisible", "", "verifyEmailErrorText", "verifyEmailSuccessText", "onBackClicked", "", "tryLogin", "onContinueClicked", "Landroid/view/View;", "onResendClicked", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class VerifyAccountViewModel extends powerwatch.matrix.com.pwgen2android.shared.BaseViewModel {
    private final java.lang.ref.WeakReference<android.app.Activity> contextWeakReference;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final androidx.databinding.ObservableField<java.lang.String> email;
    private final androidx.databinding.ObservableField<java.lang.String> errorMessage;
    private final java.lang.ref.WeakReference<androidx.fragment.app.FragmentManager> fragmentManagerWeakReference;
    private final androidx.databinding.ObservableField<java.lang.String> infoMessage;
    private final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository;
    private final java.lang.String verifyEmailErrorText;
    private final java.lang.String verifyEmailSuccessText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyAccountViewModel(powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository, powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, android.content.Context appContext) {
        java.lang.String stringExtra;
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "userAccountRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginCloudService, "loginCloudService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.userAccountRepository = userAccountRepository;
        this.loginCloudService = loginCloudService;
        this.deviceRepository = deviceRepository;
        this.contextWeakReference = new java.lang.ref.WeakReference<>(activity);
        this.fragmentManagerWeakReference = new java.lang.ref.WeakReference<>(fragmentManager);
        java.lang.String string = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.resend_email_error_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "appContext.getString(R.string.resend_email_error_message)");
        this.verifyEmailErrorText = string;
        java.lang.String string2 = appContext.getString(powerwatch.matrix.com.pwgen2android.R.string.resend_email_success_message);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "appContext.getString(R.string.resend_email_success_message)");
        this.verifyEmailSuccessText = string2;
        this.email = new androidx.databinding.ObservableField<>("");
        this.isButtonVisible = new androidx.databinding.ObservableField<>(true);
        this.errorMessage = new androidx.databinding.ObservableField<>("");
        this.infoMessage = new androidx.databinding.ObservableField<>("");
        android.content.Intent intent = activity.getIntent();
        if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.setup.DeepLinkConstantsKt.getVERIFY_URL_SCHEME(), intent.getAction()) && (stringExtra = intent.getStringExtra(powerwatch.matrix.com.pwgen2android.setup.DeepLinkConstantsKt.getBUNDLE_VERIFY_RESULT_KEY())) != null && kotlin.jvm.internal.Intrinsics.areEqual(stringExtra, powerwatch.matrix.com.pwgen2android.setup.DeepLinkConstantsKt.getBUNDLE_VERIFY_RESULT_SUCCESS())) {
            tryLogin();
        }
    }

    public final androidx.databinding.ObservableField<java.lang.String> getEmail() {
        return this.email;
    }

    public final androidx.databinding.ObservableField<java.lang.Boolean> isButtonVisible() {
        return this.isButtonVisible;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getErrorMessage() {
        return this.errorMessage;
    }

    public final androidx.databinding.ObservableField<java.lang.String> getInfoMessage() {
        return this.infoMessage;
    }

    public final void onContinueClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        tryLogin();
    }

    public final void onResendClicked(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        this.errorMessage.set("");
        this.infoMessage.set("");
        this.isButtonVisible.set(false);
        io.reactivex.disposables.CompositeDisposable compositeDisposable = getCompositeDisposable();
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.UserAccountRepository userAccountRepository = this.userAccountRepository;
        java.lang.String str = this.email.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        compositeDisposable.add(userAccountRepository.resendEmail(str).doOnEvent(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.verifyaccount.-$$Lambda$VerifyAccountViewModel$YpBoZZDO5IisuiQsqVU5RvPuJEQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel.m2955onResendClicked$lambda0(this.f$0, (java.lang.Throwable) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.setup.verifyaccount.-$$Lambda$VerifyAccountViewModel$EFARhyBI1tjS8rV5NdHefbN4ElA
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel.m2956onResendClicked$lambda1(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.verifyaccount.-$$Lambda$VerifyAccountViewModel$b_Pp7IvQ3pxGQPDdkG6dqz4rGtU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel.m2957onResendClicked$lambda2(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResendClicked$lambda-0, reason: not valid java name */
    public static final void m2955onResendClicked$lambda0(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isButtonVisible().set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResendClicked$lambda-1, reason: not valid java name */
    public static final void m2956onResendClicked$lambda1(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getInfoMessage().set(this$0.verifyEmailSuccessText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResendClicked$lambda-2, reason: not valid java name */
    public static final void m2957onResendClicked$lambda2(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getErrorMessage().set(this$0.verifyEmailErrorText);
    }

    private final void tryLogin() {
        this.errorMessage.set("");
        this.infoMessage.set("");
        this.isButtonVisible.set(false);
        getCompositeDisposable().add(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository.DefaultImpls.getFirst$default(this.userAccountRepository, false, true, 1, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.setup.verifyaccount.-$$Lambda$VerifyAccountViewModel$ATPdFFxm-EzG0Ds8-QNI6pHj3Ls
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel.m2958tryLogin$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.verifyaccount.-$$Lambda$VerifyAccountViewModel$oLEtNTZpIe-20UHOxJNzIiYZ4vM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel.m2959tryLogin$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.setup.verifyaccount.-$$Lambda$VerifyAccountViewModel$s4l6yUk_H-mfHygmtoJ2RipADJo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel.m2960tryLogin$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: tryLogin$lambda-3, reason: not valid java name */
    public static final io.reactivex.SingleSource m2958tryLogin$lambda3(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.LoginCloudService loginCloudService = this$0.loginCloudService;
        java.lang.String email = it.getEmail();
        java.lang.String password = it.getPassword();
        kotlin.jvm.internal.Intrinsics.checkNotNull(password);
        return loginCloudService.login(email, password);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: tryLogin$lambda-4, reason: not valid java name */
    public static final void m2959tryLogin$lambda4(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.fragment.app.FragmentManager fragmentManager = this$0.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.getstarted.GetStartedScreenFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: tryLogin$lambda-5, reason: not valid java name */
    public static final void m2960tryLogin$lambda5(powerwatch.matrix.com.pwgen2android.setup.verifyaccount.VerifyAccountViewModel this$0, java.lang.Throwable it) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isButtonVisible().set(true);
        if (kotlin.jvm.internal.Intrinsics.areEqual("User doesn't exist", it.getMessage())) {
            androidx.fragment.app.FragmentManager fragmentManager = this$0.fragmentManagerWeakReference.get();
            if (fragmentManager == null) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.shared.extensions.NavigationExtensionsKt.addFragment$default(fragmentManager, powerwatch.matrix.com.pwgen2android.setup.signin.SignInFragment.INSTANCE.newInstance(), powerwatch.matrix.com.pwgen2android.R.id.setup_fragment_container, false, null, 12, null);
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.cloud.RetrofitErrorResponse retrofitErrorResponseRetrofitResponse = powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorResolverKt.retrofitResponse(it);
        if (kotlin.jvm.internal.Intrinsics.areEqual(retrofitErrorResponseRetrofitResponse == null ? null : retrofitErrorResponseRetrofitResponse.getCloudErrorType(), powerwatch.matrix.com.pwgen2android.shared.cloud.CloudErrorType.UserNotEnabled.INSTANCE)) {
            android.app.Activity activity = this$0.contextWeakReference.get();
            java.lang.String str = "Your account is not validated yet.";
            if (activity != null && (string = activity.getString(powerwatch.matrix.com.pwgen2android.R.string.email_not_validated)) != null) {
                str = string;
            }
            this$0.getErrorMessage().set(str);
        }
    }

    public final void onBackClicked() {
        androidx.fragment.app.FragmentManager fragmentManager = this.fragmentManagerWeakReference.get();
        if (fragmentManager == null) {
            return;
        }
        fragmentManager.popBackStack();
    }
}
