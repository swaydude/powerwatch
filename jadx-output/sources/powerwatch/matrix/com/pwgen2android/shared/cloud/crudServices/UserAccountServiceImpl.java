package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: UserAccountService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u00042\b\u0012\u0004\u0012\u00020\u00030\u0005BE\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u001c\b\u0002\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\u0004\u0018\u0001`\u0014H\u0096\u0001J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0096\u0001J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0011\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0001J.\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001b2\u0006\u0010!\u001a\u00020#2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserAccountService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;", "userAccountConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "updateService", "getService", "addService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/userAccount/UserAccountConfig;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;)V", "add", "Lio/reactivex/Completable;", "item", "headers", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "addFirebaseToken", "Lio/reactivex/CompletableSource;", "token", "forgotPassword", "email", "get", "Lio/reactivex/Single;", "queries", "resendVerifyEmail", "resetPassword", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/ResetPassword;", "update", "verifyUser", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/PasswordCredentials;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/VerifyUser;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UserAccountServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.User>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.User>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.User> {
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.User> $$delegate_0;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.User> $$delegate_1;
    private final /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.User> $$delegate_2;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountConfig userAccountConfig;

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public io.reactivex.Completable add2(powerwatch.matrix.com.pwgen2android.shared.data.models.User item, java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this.$$delegate_1.add(item, headers);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.User> get(java.util.Map<java.lang.String, java.lang.String> queries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        return this.$$delegate_0.get(queries);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService
    public io.reactivex.Completable update(powerwatch.matrix.com.pwgen2android.shared.data.models.User item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "item");
        return this.$$delegate_2.update(item);
    }

    public UserAccountServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountConfig userAccountConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.User> updateService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.data.models.User> getService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<powerwatch.matrix.com.pwgen2android.shared.data.models.User> addService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountConfig, "userAccountConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateService, "updateService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getService, "getService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addService, "addService");
        this.userAccountConfig = userAccountConfig;
        this.httpClient = httpClient;
        this.$$delegate_0 = getService;
        this.$$delegate_1 = addService;
        this.$$delegate_2 = updateService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService
    public /* bridge */ /* synthetic */ io.reactivex.Completable add(powerwatch.matrix.com.pwgen2android.shared.data.models.User user, java.util.Map map) {
        return add2(user, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public /* synthetic */ UserAccountServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.userAccount.UserAccountConfig userAccountConfig, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateServiceImpl updateServiceImpl, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService getService, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl addServiceImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService updateServiceImpl2 = (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateServiceImpl(httpClient, userAccountConfig.getCrudServiceConfig().getUpdateEndpoint()) : updateServiceImpl;
        if ((i & 8) != 0) {
            java.lang.String getEndpoint = userAccountConfig.getCrudServiceConfig().getGetEndpoint();
            java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<powerwatch.matrix.com.pwgen2android.shared.data.models.User>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountServiceImpl.1
            }.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<User>() {}.type");
            getService = new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetServiceImpl(httpClient, getEndpoint, type);
        }
        this(userAccountConfig, httpClient, updateServiceImpl2, getService, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddServiceImpl(httpClient, userAccountConfig.getCrudServiceConfig().getAddEndpoint()) : addServiceImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService
    public io.reactivex.CompletableSource addFirebaseToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.postCompletable$default(this.httpClient, this.userAccountConfig.getFirebaseTokenUrl(), null, null, kotlin.collections.MapsKt.mapOf(new kotlin.Pair("token", token)), 2, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService
    public io.reactivex.Completable resendVerifyEmail(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.getCompletable$default(this.httpClient, this.userAccountConfig.getResendVerifyEmailUrl(), null, kotlin.collections.MapsKt.mapOf(new kotlin.Pair("email", email)), 2, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> verifyUser(powerwatch.matrix.com.pwgen2android.shared.data.models.VerifyUser verifyUser, java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifyUser, "verifyUser");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.postSingle$default(this.httpClient, this.userAccountConfig.getVerifyAccountUrl(), headers, verifyUser, null, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials.class, 8, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService
    public io.reactivex.Completable resetPassword(powerwatch.matrix.com.pwgen2android.shared.data.models.ResetPassword resetPassword) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resetPassword, "resetPassword");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.postCompletable$default(this.httpClient, this.userAccountConfig.getResetPasswordUrl(), null, resetPassword, null, 10, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserAccountService
    public io.reactivex.Completable forgotPassword(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient.DefaultImpls.getCompletable$default(this.httpClient, this.userAccountConfig.getForgotPasswordUrl(), null, kotlin.collections.MapsKt.mapOf(new kotlin.Pair("email", email)), 2, null);
    }
}
