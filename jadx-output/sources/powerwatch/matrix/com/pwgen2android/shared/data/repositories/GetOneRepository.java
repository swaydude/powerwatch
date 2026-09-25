package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: Repository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;", "ID", "DATA", "", "getOne", "Lio/reactivex/Observable;", "id", "fromCache", "", "(Ljava/lang/Object;Z)Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface GetOneRepository<ID, DATA> {
    io.reactivex.Observable<DATA> getOne(ID id, boolean fromCache);

    /* JADX INFO: compiled from: Repository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.reactivex.Observable getOne$default(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository getOneRepository, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOne");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return getOneRepository.getOne(obj, z);
        }
    }
}
