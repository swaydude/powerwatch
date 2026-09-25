package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: CrudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetService;", "Entity", "", "get", "Lio/reactivex/Single;", "queries", "", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface GetService<Entity> {
    io.reactivex.Single<Entity> get(java.util.Map<java.lang.String, java.lang.String> queries);

    /* JADX INFO: compiled from: CrudServices.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Single get$default(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetService getService, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 1) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            return getService.get(map);
        }
    }
}
