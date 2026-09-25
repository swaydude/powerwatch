package powerwatch.matrix.com.pwgen2android.sdk.technologies;

/* JADX INFO: compiled from: Technology.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;", "", "accessoryChange", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "getAccessoryChange", "()Lio/reactivex/Observable;", "add", "", "accessoryID", "", "accessory", "clear", "clearAll", "contains", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AccessoryProvider {
    void add(java.lang.String accessoryID, powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory);

    void clear(java.lang.String accessoryID);

    void clearAll();

    boolean contains(java.lang.String accessoryID);

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> getAccessoryChange();
}
