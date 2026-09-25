package powerwatch.matrix.com.pwgen2android.sdk.channels;

/* JADX INFO: compiled from: SimpleBLECommunicationChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0001J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\n\u001a\u00020\u000eH\u0096\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u0096\u0001J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0017\u001a\u00020\bH\u0096\u0001J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0017\u001a\u00020\bH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "communicationChannel", "(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V", "close", "Lio/reactivex/Completable;", "eventData", "Lio/reactivex/Observable;", "", "open", "characteristic", "Ljava/util/UUID;", "read", "Lio/reactivex/Single;", "", "receivedData", "refresh", "", "requestMTU", "", "mtu", "resubscribeCharacteristics", "send", "data", "sendEvent", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SimpleBLECommunicationChannel implements powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel {
    private final powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel;

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable close() {
        return this.communicationChannel.close();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Observable<byte[]> eventData() {
        return this.communicationChannel.eventData();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable open(java.util.UUID characteristic) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        return this.communicationChannel.open(characteristic);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> read(java.lang.String characteristic) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        return this.communicationChannel.read(characteristic);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Observable<byte[]> receivedData() {
        return this.communicationChannel.receivedData();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public void refresh() {
        this.communicationChannel.refresh();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<java.lang.Integer> requestMTU(int mtu) {
        return this.communicationChannel.requestMTU(mtu);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable resubscribeCharacteristics() {
        return this.communicationChannel.resubscribeCharacteristics();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> send(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return this.communicationChannel.send(data);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> sendEvent(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return this.communicationChannel.sendEvent(data);
    }

    public SimpleBLECommunicationChannel(powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel communicationChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicationChannel, "communicationChannel");
        this.communicationChannel = communicationChannel;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable open() {
        io.reactivex.Completable completableAndThen = requestMTU(96).ignoreElement().andThen(this.communicationChannel.open());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "requestMTU(96).ignoreElement()\n                .andThen(communicationChannel.open())");
        return completableAndThen;
    }
}
