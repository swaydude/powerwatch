package powerwatch.matrix.com.pwgen2android.sdk.channels;

/* JADX INFO: compiled from: CommunicationChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\b\u001a\u00020\fH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0015\u001a\u00020\u0006H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0015\u001a\u00020\u0006H&¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "", "close", "Lio/reactivex/Completable;", "eventData", "Lio/reactivex/Observable;", "", "open", "characteristic", "Ljava/util/UUID;", "read", "Lio/reactivex/Single;", "", "receivedData", "refresh", "", "requestMTU", "", "mtu", "resubscribeCharacteristics", "send", "data", "sendEvent", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface CommunicationChannel {
    io.reactivex.Completable close();

    io.reactivex.Observable<byte[]> eventData();

    io.reactivex.Completable open();

    io.reactivex.Completable open(java.util.UUID characteristic);

    io.reactivex.Single<byte[]> read(java.lang.String characteristic);

    io.reactivex.Observable<byte[]> receivedData();

    void refresh();

    io.reactivex.Single<java.lang.Integer> requestMTU(int mtu);

    io.reactivex.Completable resubscribeCharacteristics();

    io.reactivex.Single<byte[]> send(byte[] data);

    io.reactivex.Single<byte[]> sendEvent(byte[] data);

    /* JADX INFO: compiled from: CommunicationChannel.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static io.reactivex.Completable open(powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel, java.util.UUID characteristic) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicationChannel, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
            io.reactivex.Completable completableComplete = io.reactivex.Completable.complete();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete, "complete()");
            return completableComplete;
        }

        public static io.reactivex.Observable<byte[]> eventData(powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicationChannel, "this");
            io.reactivex.Observable<byte[]> observableEmpty = io.reactivex.Observable.empty();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty()");
            return observableEmpty;
        }
    }
}
