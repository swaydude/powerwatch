package powerwatch.matrix.com.pwgen2android.report.provider;

/* JADX INFO: compiled from: ReportInfoProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/report/provider/ReportInfoProvider;", "", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "hostInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "tokenProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;", "httpConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;", "(Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/shared/host/HostInfoProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/auth/TokenProvider;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpConfig;)V", "loadCountryCode", "", "context", "Landroid/content/Context;", "provideUserEnvironment", "Lio/reactivex/Maybe;", "Lpowerwatch/matrix/com/pwgen2android/report/model/UserEnvironment;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ReportInfoProvider {
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public ReportInfoProvider(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.shared.host.HostInfoProvider hostInfoProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenProvider tokenProvider, powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpConfig httpConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hostInfoProvider, "hostInfoProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpConfig, "httpConfig");
        this.userPrefsUtils = userPrefsUtils;
        this.hostInfoProvider = hostInfoProvider;
        this.deviceRepository = deviceRepository;
        this.tokenProvider = tokenProvider;
        this.httpConfig = httpConfig;
    }

    static /* synthetic */ java.lang.String loadCountryCode$default(powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider reportInfoProvider, android.content.Context context, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return reportInfoProvider.loadCountryCode(context);
    }

    private final java.lang.String loadCountryCode(android.content.Context context) {
        if (context == null) {
            java.lang.String id = java.util.TimeZone.getDefault().getID();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "getDefault().id");
            return id;
        }
        java.lang.Object systemService = context.getSystemService("phone");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        ((android.telephony.TelephonyManager) systemService).getNetworkCountryIso();
        java.lang.String id2 = java.util.TimeZone.getDefault().getID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id2, "getDefault().id");
        return id2;
    }

    public final io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment> provideUserEnvironment() {
        io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment> maybeFirstElement = this.deviceRepository.defaultDevice().toMaybe().flatMapObservable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.report.provider.-$$Lambda$ReportInfoProvider$7SA5KDT7sXq3rNxXTZkpD-0mK08
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider.m2094provideUserEnvironment$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }).firstElement();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "deviceRepository\n                .defaultDevice()\n                .toMaybe()\n                .flatMapObservable {device ->\n                    Observable.combineLatest(\n                            userPrefsUtils.userPrefs(),\n                            tokenProvider.get(), BiFunction <User, Optional<PasswordCredentials>, UserEnvironment>\n                    { userPrefs, token ->\n\n                        UserEnvironment(\n                                userPrefs.email,\n                                hostInfoProvider.hostInfo(false).uuid,\n                                userPrefs.accountSettings.language,\n                                device.bluetoothAddress,\n                                loadCountryCode(null),\n                                token.element?.accessToken ?: \"null\",\n                                httpConfig.baseURL\n                        )\n                    })\n                }\n                .firstElement()");
        return maybeFirstElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: provideUserEnvironment$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2094provideUserEnvironment$lambda1(final powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider this$0, final powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return io.reactivex.Observable.combineLatest(this$0.userPrefsUtils.userPrefs(), this$0.tokenProvider.get(), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.report.provider.-$$Lambda$ReportInfoProvider$6c7JLNyhexjVcoIBQ13XUDvC5aw
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider.m2095provideUserEnvironment$lambda1$lambda0(this.f$0, device, (powerwatch.matrix.com.pwgen2android.shared.data.models.User) obj, (powerwatch.matrix.com.pwgen2android.shared.cloud.Optional) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: provideUserEnvironment$lambda-1$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment m2095provideUserEnvironment$lambda1$lambda0(powerwatch.matrix.com.pwgen2android.report.provider.ReportInfoProvider this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, powerwatch.matrix.com.pwgen2android.shared.data.models.User userPrefs, powerwatch.matrix.com.pwgen2android.shared.cloud.Optional token) {
        java.lang.String accessToken;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "$device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefs, "userPrefs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        java.lang.String email = userPrefs.getEmail();
        java.lang.String uuid = this$0.hostInfoProvider.hostInfo(false).getUuid();
        java.lang.String language = userPrefs.getAccountSettings().getLanguage();
        java.lang.String bluetoothAddress = device.getBluetoothAddress();
        java.lang.String strLoadCountryCode = this$0.loadCountryCode(null);
        powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials = (powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials) token.getElement();
        return new powerwatch.matrix.com.pwgen2android.report.model.UserEnvironment(email, uuid, language, bluetoothAddress, strLoadCountryCode, (passwordCredentials == null || (accessToken = passwordCredentials.getAccessToken()) == null) ? "null" : accessToken, this$0.httpConfig.getBaseURL());
    }
}
