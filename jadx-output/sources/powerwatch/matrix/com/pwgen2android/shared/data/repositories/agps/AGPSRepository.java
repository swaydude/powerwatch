package powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps;

/* JADX INFO: compiled from: AGPSRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/AGPSRepository;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetOneRepository;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/agps/GPSFile;", "Lpowerwatch/matrix/com/pwgen2android/secret/SaveRepository;", "isWatchUpdateNeeded", "", "storeLastUpdateTimestamp", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AGPSRepository extends powerwatch.matrix.com.pwgen2android.shared.data.repositories.GetOneRepository<java.lang.String, powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile>, powerwatch.matrix.com.pwgen2android.secret.SaveRepository<powerwatch.matrix.com.pwgen2android.shared.data.repositories.agps.GPSFile> {
    boolean isWatchUpdateNeeded();

    void storeLastUpdateTimestamp();
}
