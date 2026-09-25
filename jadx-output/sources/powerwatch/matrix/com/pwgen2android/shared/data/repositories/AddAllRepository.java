package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: Repository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J \u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddAllRepository;", "DATA", "", "save", "Lio/reactivex/Completable;", "items", "", "toCacheOnly", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AddAllRepository<DATA> {
    io.reactivex.Completable save(java.util.List<? extends DATA> items, boolean toCacheOnly);

    /* JADX INFO: compiled from: Repository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.reactivex.Completable save$default(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddAllRepository addAllRepository, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return addAllRepository.save(list, z);
        }
    }
}
