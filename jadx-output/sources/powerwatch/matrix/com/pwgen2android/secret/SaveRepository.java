package powerwatch.matrix.com.pwgen2android.secret;

/* JADX INFO: compiled from: SecretScreenFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/secret/SaveRepository;", "ENTITY", "", "save", "Lio/reactivex/Single;", "entity", "(Ljava/lang/Object;)Lio/reactivex/Single;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface SaveRepository<ENTITY> {
    io.reactivex.Single<ENTITY> save(ENTITY entity);
}
