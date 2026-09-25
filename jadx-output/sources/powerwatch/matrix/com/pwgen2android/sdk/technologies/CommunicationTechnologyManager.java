package powerwatch.matrix.com.pwgen2android.sdk.technologies;

/* JADX INFO: compiled from: TechnologyManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/CommunicationTechnologyManager;", "", "connectionAccessoryStatus", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "scanningAccessoryStatus", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface CommunicationTechnologyManager {
    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> connectionAccessoryStatus();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> scanningAccessoryStatus();
}
