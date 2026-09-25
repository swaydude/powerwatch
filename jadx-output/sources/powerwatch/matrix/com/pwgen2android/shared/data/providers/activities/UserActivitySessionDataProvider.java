package powerwatch.matrix.com.pwgen2android.shared.data.providers.activities;

/* JADX INFO: compiled from: UserActivitySessionDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/UserActivitySessionDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/DataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "", "loadSessionById", "Lio/reactivex/Observable;", "id", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface UserActivitySessionDataProvider extends powerwatch.matrix.com.pwgen2android.shared.data.providers.DataProvider<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession, java.lang.String> {
    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> loadSessionById(java.lang.String id);
}
