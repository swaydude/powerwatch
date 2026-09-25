package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: NetworkInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;", "", "isEnabled", "", "()Z", "networkStatusChange", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkStatus;", "getNetworkStatusChange", "()Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface NetworkInfoProvider {
    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.host.NetworkStatus> getNetworkStatusChange();

    boolean isEnabled();
}
