package powerwatch.matrix.com.pwgen2android.shared.cloud.fonts;

/* JADX INFO: compiled from: FontUpdateService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;", "httpClient", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;", "fontUpdateConfiguration", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;", "downloadExecutor", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;", "getService", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/HttpClient;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DownloadJSONServiceImpl;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;)V", "get", "Lio/reactivex/Single;", "queries", "", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FontUpdateService implements powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo> {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadJSONServiceImpl downloadExecutor;
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo> getService;

    public FontUpdateService(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration fontUpdateConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadJSONServiceImpl downloadExecutor, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo> getService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fontUpdateConfiguration, "fontUpdateConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getService, "getService");
        this.downloadExecutor = downloadExecutor;
        this.getService = getService;
    }

    public /* synthetic */ FontUpdateService(powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpClient httpClient, powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateConfiguration fontUpdateConfiguration, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DownloadJSONServiceImpl downloadJSONServiceImpl, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService getService, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            java.lang.String getUpdateInfoEndpoint = fontUpdateConfiguration.getGetUpdateInfoEndpoint();
            java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo>() { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateService.1
            }.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<FontUpdateInfo>() {}.type");
            getService = new powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetServiceImpl(httpClient, getUpdateInfoEndpoint, type);
        }
        this(httpClient, fontUpdateConfiguration, downloadJSONServiceImpl, getService);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo> get(java.util.Map<java.lang.String, java.lang.String> queries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queries, "queries");
        return powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService.DefaultImpls.get$default(this.getService, null, 1, null);
    }
}
