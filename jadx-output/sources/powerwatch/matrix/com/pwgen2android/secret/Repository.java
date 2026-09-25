package powerwatch.matrix.com.pwgen2android.secret;

/* JADX INFO: compiled from: SecretScreenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH&J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0013H&J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH&¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/secret/Repository;", "ENTITY", "ID", "", "count", "", "delete", "Lio/reactivex/Single;", "entity", "(Ljava/lang/Object;)Lio/reactivex/Single;", "deleteAll", "", "entities", "", "existsById", "", "id", "(Ljava/lang/Object;)Z", "findAll", "Lio/reactivex/Observable;", "findById", "Lio/reactivex/Maybe;", "(Ljava/lang/Object;)Lio/reactivex/Maybe;", "save", "saveAll", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Repository<ENTITY, ID> {
    long count();

    io.reactivex.Single<ENTITY> delete(ENTITY entity);

    io.reactivex.Single<java.util.List<ENTITY>> deleteAll(java.lang.Iterable<? extends ENTITY> entities);

    boolean existsById(ID id);

    io.reactivex.Observable<java.util.List<ENTITY>> findAll();

    io.reactivex.Maybe<ENTITY> findById(ID id);

    io.reactivex.Single<ENTITY> save(ENTITY entity);

    io.reactivex.Single<java.util.List<ENTITY>> saveAll(java.lang.Iterable<? extends ENTITY> entities);
}
