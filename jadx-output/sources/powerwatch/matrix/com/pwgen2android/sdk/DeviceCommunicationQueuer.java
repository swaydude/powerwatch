package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: DeviceCommunicationQueuer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH&¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "", "clear", "", "queue", "Lio/reactivex/Observable;", "T", "operation", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface DeviceCommunicationQueuer {
    void clear();

    <T> io.reactivex.Observable<T> queue(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation<T> operation);
}
