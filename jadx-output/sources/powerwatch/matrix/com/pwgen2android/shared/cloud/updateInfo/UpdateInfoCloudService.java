package powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo;

/* JADX INFO: compiled from: UpdateInfoCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;", "", "getUpdateInfo", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "pid", "", "language", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface UpdateInfoCloudService {
    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> getUpdateInfo(java.lang.String pid, java.lang.String language);
}
