package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: compiled from: BaseDao.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\fH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00028\u0001H&¢\u0006\u0002\u0010\nJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0011\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/db/BaseDao;", "T", "ID", "", "add", "", "item", "(Ljava/lang/Object;)V", "addCompletable", "Lio/reactivex/Completable;", "(Ljava/lang/Object;)Lio/reactivex/Completable;", "all", "Lio/reactivex/Single;", "", "count", "", "delete", "id", "deleteCompletable", "get", "Lio/reactivex/Maybe;", "(Ljava/lang/Object;)Lio/reactivex/Maybe;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface BaseDao<T, ID> {
    void add(T item);

    io.reactivex.Completable addCompletable(T item);

    io.reactivex.Single<java.util.List<T>> all();

    long count();

    void delete(ID id);

    io.reactivex.Completable deleteCompletable(ID id);

    io.reactivex.Maybe<T> get(ID id);
}
