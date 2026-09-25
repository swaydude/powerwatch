package powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo;

/* JADX INFO: compiled from: UpdateInfoCloudService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudServiceImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/updateInfo/UpdateInfoCloudService;", "updateInfoCrudService", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;", "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateInfoService;)V", "getUpdateInfo", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UpdateInfo;", "pid", "", "language", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class UpdateInfoCloudServiceImpl implements powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService {
    private final powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService updateInfoCrudService;

    public UpdateInfoCloudServiceImpl(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateInfoService updateInfoCrudService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoCrudService, "updateInfoCrudService");
        this.updateInfoCrudService = updateInfoCrudService;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.updateInfo.UpdateInfoCloudService
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.UpdateInfo> getUpdateInfo(java.lang.String pid, java.lang.String language) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pid, "pid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        return this.updateInfoCrudService.get(kotlin.collections.MapsKt.mutableMapOf(new kotlin.Pair("pid", pid), new kotlin.Pair("language", language)));
    }
}
