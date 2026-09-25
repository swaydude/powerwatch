package powerwatch.matrix.com.pwgen2android.sdk.connection;

/* JADX INFO: compiled from: Connection.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\tH&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;", "", "connectionInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;", "getConnectionInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;", "setConnectionInfo", "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;)V", "close", "Lio/reactivex/Completable;", "messageOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;", "open", "Lio/reactivex/Single;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;", "refresh", "", "resubscribeCharacteristics", "sendMessage", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Connection {
    io.reactivex.Completable close();

    powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo getConnectionInfo();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> messageOutput();

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.InitInfo> open();

    void refresh();

    io.reactivex.Completable resubscribeCharacteristics();

    io.reactivex.Completable sendMessage(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message);

    void setConnectionInfo(powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo connectionInfo);
}
