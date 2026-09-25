package powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs;

/* JADX INFO: compiled from: BaseLogRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&J\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&J\b\u0010\u0011\u001a\u00020\u0012H\u0004J\u001e\u0010\u0013\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0015\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/activityLogs/BaseLogRepositoryImpl;", "T", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;", "metricsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V", "copyItem", "item", "shouldSave", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;Z)Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchBaseLog;", "getSaveCloudCompletable", "Lio/reactivex/Completable;", "logs", "", "getSaveLogsCompletable", "logUploadFailedError", "", "save", "items", "toCacheOnly", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BaseLogRepositoryImpl<T extends powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WatchBaseLog> implements powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository<T> {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository;

    public abstract T copyItem(T item, boolean shouldSave);

    public abstract io.reactivex.Completable getSaveCloudCompletable(java.util.List<? extends T> logs);

    public abstract io.reactivex.Completable getSaveLogsCompletable(java.util.List<? extends T> logs);

    protected final void logUploadFailedError() {
    }

    public BaseLogRepositoryImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.metrics.MetricsRepository metricsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRepository, "metricsRepository");
        this.metricsRepository = metricsRepository;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository
    public io.reactivex.Completable save(java.util.List<? extends T> items, boolean toCacheOnly) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "items");
        io.reactivex.Completable completableFlatMapCompletable = io.reactivex.Observable.just(items).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$BaseLogRepositoryImpl$YV6SlcuAzTsmKPUQjOa4E1OvKq8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl.m3238save$lambda1(this.f$0, (java.util.List) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.-$$Lambda$BaseLogRepositoryImpl$6w1BZ98VuJogIwrjnwnkgUdgwpQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl.m3239save$lambda2(this.f$0, (java.util.List) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "just(items)\n                .map { list ->\n                    list.map { copyItem(it, true) }\n                }\n                .flatMapCompletable { itemsToSave ->\n                    getSaveLogsCompletable(itemsToSave)\n                }");
        return completableFlatMapCompletable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: save$lambda-1, reason: not valid java name */
    public static final java.util.List m3238save$lambda1(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl this$0, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this$0.copyItem((powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WatchBaseLog) it.next(), true));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: save$lambda-2, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3239save$lambda2(powerwatch.matrix.com.pwgen2android.shared.data.repositories.activityLogs.BaseLogRepositoryImpl this$0, java.util.List itemsToSave) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemsToSave, "itemsToSave");
        return this$0.getSaveLogsCompletable(itemsToSave);
    }
}
