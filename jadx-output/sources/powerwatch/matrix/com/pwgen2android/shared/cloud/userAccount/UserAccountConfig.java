package powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount;

/* JADX INFO: compiled from: UserAccountConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;", "", "forgotPasswordUrl", "", "resetPasswordUrl", "verifyAccountUrl", "resendVerifyEmailUrl", "firebaseTokenUrl", "crudServiceConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;)V", "getCrudServiceConfig", "()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/CRUDServiceConfig;", "getFirebaseTokenUrl", "()Ljava/lang/String;", "getForgotPasswordUrl", "getResendVerifyEmailUrl", "getResetPasswordUrl", "getVerifyAccountUrl", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserAccountConfig {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig crudServiceConfig;
    private final java.lang.String firebaseTokenUrl;
    private final java.lang.String forgotPasswordUrl;
    private final java.lang.String resendVerifyEmailUrl;
    private final java.lang.String resetPasswordUrl;
    private final java.lang.String verifyAccountUrl;

    public UserAccountConfig(java.lang.String forgotPasswordUrl, java.lang.String resetPasswordUrl, java.lang.String verifyAccountUrl, java.lang.String resendVerifyEmailUrl, java.lang.String firebaseTokenUrl, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig crudServiceConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forgotPasswordUrl, "forgotPasswordUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resetPasswordUrl, "resetPasswordUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifyAccountUrl, "verifyAccountUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resendVerifyEmailUrl, "resendVerifyEmailUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseTokenUrl, "firebaseTokenUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crudServiceConfig, "crudServiceConfig");
        this.forgotPasswordUrl = forgotPasswordUrl;
        this.resetPasswordUrl = resetPasswordUrl;
        this.verifyAccountUrl = verifyAccountUrl;
        this.resendVerifyEmailUrl = resendVerifyEmailUrl;
        this.firebaseTokenUrl = firebaseTokenUrl;
        this.crudServiceConfig = crudServiceConfig;
    }

    public final java.lang.String getForgotPasswordUrl() {
        return this.forgotPasswordUrl;
    }

    public final java.lang.String getResetPasswordUrl() {
        return this.resetPasswordUrl;
    }

    public final java.lang.String getVerifyAccountUrl() {
        return this.verifyAccountUrl;
    }

    public final java.lang.String getResendVerifyEmailUrl() {
        return this.resendVerifyEmailUrl;
    }

    public final java.lang.String getFirebaseTokenUrl() {
        return this.firebaseTokenUrl;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.CRUDServiceConfig getCrudServiceConfig() {
        return this.crudServiceConfig;
    }
}
