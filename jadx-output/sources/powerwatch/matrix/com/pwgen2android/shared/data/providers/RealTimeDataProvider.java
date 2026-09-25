package powerwatch.matrix.com.pwgen2android.shared.data.providers;

/* JADX INFO: compiled from: RealTimeDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/DataProvider;", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;", "", "observeCurrentData", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;", "observeData", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface RealTimeDataProvider extends powerwatch.matrix.com.pwgen2android.shared.data.providers.DataProvider<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData, java.lang.Long> {
    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData> observeCurrentData();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData> observeData(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page);
}
