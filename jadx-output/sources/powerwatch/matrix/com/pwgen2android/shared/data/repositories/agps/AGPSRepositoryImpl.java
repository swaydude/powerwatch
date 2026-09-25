package powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps;

/* JADX INFO: compiled from: AGPSRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u000fH\u0096\u0001J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;", "downloadExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;", "appContext", "Landroid/content/Context;", "agpsRepositoryCache", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;", "(Lpowerwatch/matrix/com/pwgen2android/main/DownloadExecutor;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;)V", "getOne", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;", "id", "", "fromCache", "", "isWatchUpdateNeeded", "save", "Lio/reactivex/Single;", "entity", "storeLastUpdateTimestamp", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AGPSRepositoryImpl implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepository {
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryCache agpsRepositoryCache;
    private final android.content.Context appContext;
    private final powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor;

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepository
    public boolean isWatchUpdateNeeded() {
        return this.agpsRepositoryCache.isWatchUpdateNeeded();
    }

    @Override // powerwatch.matrix.com.pwgen2android.secret.SaveRepository
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile> save(powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        return this.agpsRepositoryCache.save(entity);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepository
    public void storeLastUpdateTimestamp() {
        this.agpsRepositoryCache.storeLastUpdateTimestamp();
    }

    public AGPSRepositoryImpl(powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor, android.content.Context appContext, powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryCache agpsRepositoryCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agpsRepositoryCache, "agpsRepositoryCache");
        this.downloadExecutor = downloadExecutor;
        this.appContext = appContext;
        this.agpsRepositoryCache = agpsRepositoryCache;
    }

    public /* synthetic */ AGPSRepositoryImpl(powerwatch.matrix.com.pwgen2android.main.DownloadExecutor downloadExecutor, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryCache aGPSRepositoryCache, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(downloadExecutor, context, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryCache(context) : aGPSRepositoryCache);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile> getOne(java.lang.String id, boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        io.reactivex.Observable map = this.downloadExecutor.execute("https://s3.us-west-1.amazonaws.com/powerwatch-gps/gpsAssistantFile.bin").map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.-$$Lambda$AGPSRepositoryImpl$VwFZ82i819DsOcuvbVzQUpzZIgI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryImpl.m3282getOne$lambda0((kotlin.Pair) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "downloadExecutor\n                        .execute(\"https://s3.us-west-1.amazonaws.com/powerwatch-gps/gpsAssistantFile.bin\")\n                        .map { downloadResult ->\n                            GPSFile(downloadResult.second, \"gpsAssistantFile.bin\")\n                        }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOne$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile m3282getOne$lambda0(kotlin.Pair downloadResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadResult, "downloadResult");
        return new powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile((byte[]) downloadResult.getSecond(), "gpsAssistantFile.bin");
    }
}
