package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: Repository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J(\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;", "DATA", "", "all", "Lio/reactivex/Observable;", "", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "fromCache", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AllRepository<DATA> {
    io.reactivex.Observable<java.util.List<DATA>> all(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, boolean fromCache);

    /* JADX INFO: compiled from: Repository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.reactivex.Observable all$default(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository allRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: all");
            }
            if ((i & 1) != 0) {
                page = new powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page(0, 0L, 0L, 0, 15, null);
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return allRepository.all(page, z);
        }
    }
}
