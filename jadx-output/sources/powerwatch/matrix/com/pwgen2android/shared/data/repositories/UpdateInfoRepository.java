package powerwatch.matrix.com.pwgen2android.shared.data.repositories;

/* JADX INFO: compiled from: UpdateInfoRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UpdateInfoParams;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;", "delete", "Lio/reactivex/Completable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface UpdateInfoRepository extends powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository<powerwatch.matrix.com.pwgen2android.shared.data.repositories.UpdateInfoParams, powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo>, powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> {
    io.reactivex.Completable delete();
}
