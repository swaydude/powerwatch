package powerwatch.matrix.com.pwgen2android.fcm;

/* JADX INFO: compiled from: FirebaseTokenProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingTokenProvider;", "", "token", "Lio/reactivex/Observable;", "", "getToken", "()Lio/reactivex/Observable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface PushMessagingTokenProvider {
    io.reactivex.Observable<java.lang.String> getToken();
}
