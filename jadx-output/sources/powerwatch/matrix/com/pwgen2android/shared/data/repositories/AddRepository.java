package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: Repository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;", "DATA", "", "save", "Lio/reactivex/Completable;", "item", "toCacheOnly", "", "(Ljava/lang/Object;Z)Lio/reactivex/Completable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AddRepository<DATA> {
    io.reactivex.Completable save(DATA item, boolean toCacheOnly);

    /* JADX INFO: compiled from: Repository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.reactivex.Completable save$default(powerwatch.matrix.com.pwgen2android.shared.data.repositories.AddRepository addRepository, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return addRepository.save(obj, z);
        }
    }
}
