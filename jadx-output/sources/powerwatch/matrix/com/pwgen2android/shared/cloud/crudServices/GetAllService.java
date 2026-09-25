package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: CrudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J*\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;", "Entity", "", "all", "Lio/reactivex/Single;", "", "queryParams", "", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface GetAllService<Entity> {
    io.reactivex.Single<java.util.List<Entity>> all(java.util.Map<java.lang.String, java.lang.String> queryParams);

    /* JADX INFO: compiled from: CrudServices.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Single all$default(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService getAllService, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: all");
            }
            if ((i & 1) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            return getAllService.all(map);
        }
    }
}
