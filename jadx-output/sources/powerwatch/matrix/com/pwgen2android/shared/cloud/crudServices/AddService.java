package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: CrudServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J3\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;", "Entity", "", "add", "Lio/reactivex/Completable;", "item", "headers", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/http/Headers;", "(Ljava/lang/Object;Ljava/util/Map;)Lio/reactivex/Completable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AddService<Entity> {
    io.reactivex.Completable add(Entity item, java.util.Map<java.lang.String, java.lang.String> headers);

    /* JADX INFO: compiled from: CrudServices.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Completable add$default(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService addService, java.lang.Object obj, java.util.Map map, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return addService.add(obj, map);
        }
    }
}
