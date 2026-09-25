package powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps;

/* JADX INFO: compiled from: AGPSRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepositoryCache;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "FILE_PREFIX_KEY", "", "TIMESTAMP_LOCATION", "UPDATE_FINISHED_TIMESTAMP", "threshold", "", "getOne", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;", "id", "fromCache", "", "isWatchUpdateNeeded", "save", "Lio/reactivex/Single;", "entity", "storeLastUpdateTimestamp", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AGPSRepositoryCache implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepository {
    private final java.lang.String FILE_PREFIX_KEY;
    private final java.lang.String TIMESTAMP_LOCATION;
    private final java.lang.String UPDATE_FINISHED_TIMESTAMP;
    private final android.content.Context context;
    private final long threshold;

    public AGPSRepositoryCache(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.threshold = 1814400000L;
        this.FILE_PREFIX_KEY = "gps_file_";
        this.TIMESTAMP_LOCATION = "gps_file_timestamp";
        this.UPDATE_FINISHED_TIMESTAMP = "update_finished";
    }

    @Override // powerwatch.matrix.com.pwgen2android.secret.SaveRepository
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile> save(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile entity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "entity");
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile> singleCreate = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.-$$Lambda$AGPSRepositoryCache$3lpnkz7oW6a8C89oqsiYQZyxFl0
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) throws java.lang.Throwable {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryCache.m3281save$lambda0(entity, this, singleEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleCreate, "create {\n            val s = deleteFile(entity.fileName, context)\n            println(\"File deleted: $s\")\n            val f = writeContentToFile(entity.content, entity.fileName, context)\n            val time = System.currentTimeMillis()\n            PreferenceManager.getDefaultSharedPreferences(context).edit().putLong(TIMESTAMP_LOCATION, time).apply()\n            println(\"File written: ${f?.totalSpace}\")\n            it.onSuccess(entity)\n        }");
        return singleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: save$lambda-0, reason: not valid java name */
    public static final void m3281save$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile entity, powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryCache this$0, io.reactivex.SingleEmitter it) throws java.lang.Throwable {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entity, "$entity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("File deleted: ", java.lang.Boolean.valueOf(powerwatch.matrix.com.pwgen2android.shared.extensions.FileExtensionsKt.deleteFile(entity.getFileName(), this$0.context))));
        java.io.File fileWriteContentToFile = powerwatch.matrix.com.pwgen2android.shared.extensions.FileExtensionsKt.writeContentToFile(entity.getContent(), entity.getFileName(), this$0.context);
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this$0.context).edit().putLong(this$0.TIMESTAMP_LOCATION, java.lang.System.currentTimeMillis()).apply();
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("File written: ", fileWriteContentToFile == null ? null : java.lang.Long.valueOf(fileWriteContentToFile.getTotalSpace())));
        it.onSuccess(entity);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile> getOne(final java.lang.String id, boolean fromCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile> observableCreate = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.-$$Lambda$AGPSRepositoryCache$GybjmaorvecWQrzfzLWAbgvpSR0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryCache.m3280getOne$lambda1(this.f$0, id, observableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableCreate, "create {\n\n            val currentTime = System.currentTimeMillis()\n            val lastTime = PreferenceManager.getDefaultSharedPreferences(context).getLong(TIMESTAMP_LOCATION, -1)\n            if (lastTime != -1L && (currentTime - lastTime < threshold)) {\n                val filePair = readFile(id, context)\n                val data = filePair.second\n                if (data != null) {\n                    println(\"File size: ${data.size}\")\n                    it.onNext(GPSFile(data, filePair.first))\n                }\n            }\n            it.onComplete()\n        }");
        return observableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getOne$lambda-1, reason: not valid java name */
    public static final void m3280getOne$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepositoryCache this$0, java.lang.String id, io.reactivex.ObservableEmitter it) {
        kotlin.Pair<java.lang.String, byte[]> file;
        byte[] second;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "$id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = androidx.preference.PreferenceManager.getDefaultSharedPreferences(this$0.context).getLong(this$0.TIMESTAMP_LOCATION, -1L);
        if (j != -1 && jCurrentTimeMillis - j < this$0.threshold && (second = (file = powerwatch.matrix.com.pwgen2android.shared.extensions.FileExtensionsKt.readFile(id, this$0.context)).getSecond()) != null) {
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("File size: ", java.lang.Integer.valueOf(second.length)));
            it.onNext(new powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile(second, file.getFirst()));
        }
        it.onComplete();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepository
    public void storeLastUpdateTimestamp() {
        androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.context).edit().putLong(this.UPDATE_FINISHED_TIMESTAMP, java.lang.System.currentTimeMillis()).commit();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.AGPSRepository
    public boolean isWatchUpdateNeeded() {
        return java.lang.System.currentTimeMillis() - androidx.preference.PreferenceManager.getDefaultSharedPreferences(this.context).getLong(this.UPDATE_FINISHED_TIMESTAMP, -1L) >= 60000;
    }
}
