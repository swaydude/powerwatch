package powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices;

/* JADX INFO: compiled from: UserActivityServices.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00020\u00052\b\u0012\u0004\u0012\u00020\u00020\u0006J*\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UserActivityService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/GetAllService;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/AddService;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/DeleteService;", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/crudServices/UpdateService;", "getAllUserActivityDates", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivityDate;", "params", "", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface UserActivityService extends powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.GetAllService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.AddService<java.util.List<? extends powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.DeleteService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>, powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UpdateService<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> {
    io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>> getAllUserActivityDates(java.util.Map<java.lang.String, java.lang.String> params);

    /* JADX INFO: compiled from: UserActivityServices.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.reactivex.Single getAllUserActivityDates$default(powerwatch.matrix.com.pwgen2android.shared.cloud.crudServices.UserActivityService userActivityService, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllUserActivityDates");
            }
            if ((i & 1) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            return userActivityService.getAllUserActivityDates(map);
        }
    }
}
