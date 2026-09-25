package powerwatch.matrix.com.pwgen2android.secret;

/* JADX INFO: compiled from: SecretScreenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/secret/FindByIdRepository;", "ENTITY", "ID", "", "findById", "Lio/reactivex/Maybe;", "id", "(Ljava/lang/Object;)Lio/reactivex/Maybe;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface FindByIdRepository<ENTITY, ID> {
    io.reactivex.Maybe<ENTITY> findById(ID id);
}
