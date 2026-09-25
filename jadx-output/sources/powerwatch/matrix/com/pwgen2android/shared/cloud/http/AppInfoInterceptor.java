package powerwatch.matrix.com.pwgen2android.shared.cloud.http;

/* JADX INFO: compiled from: AppInfoInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/AppInfoInterceptor;", "Lokhttp3/Interceptor;", "()V", "userAgentInfo", "", "createUserAgentInfo", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppInfoInterceptor implements okhttp3.Interceptor {
    private final java.lang.String userAgentInfo = createUserAgentInfo();

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.Response responseProceed = chain.proceed(chain.request().newBuilder().header("User-Agent", this.userAgentInfo).build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(responseProceed, "chain.proceed(userAgentRequest)");
        return responseProceed;
    }

    private final java.lang.String createUserAgentInfo() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "Android: %s (%s); %s,OS: %s, %s", java.util.Arrays.copyOf(new java.lang.Object[]{powerwatch.matrix.com.pwgen2android.BuildConfig.VERSION_NAME, java.lang.Integer.valueOf(powerwatch.matrix.com.pwgen2android.BuildConfig.VERSION_CODE), android.os.Build.MODEL, android.os.Build.VERSION.RELEASE, android.os.Build.DEVICE}, 5));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        return str;
    }
}
