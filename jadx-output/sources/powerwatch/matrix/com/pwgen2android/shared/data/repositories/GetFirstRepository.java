package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: Repository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;", "DATA", "", "getFirst", "Lio/reactivex/Single;", "fromCache", "", "forceCache", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface GetFirstRepository<DATA> {
    io.reactivex.Single<DATA> getFirst(boolean fromCache, boolean forceCache);

    /* JADX INFO: compiled from: Repository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.reactivex.Single getFirst$default(powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetFirstRepository getFirstRepository, boolean z, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFirst");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return getFirstRepository.getFirst(z, z2);
        }
    }
}
