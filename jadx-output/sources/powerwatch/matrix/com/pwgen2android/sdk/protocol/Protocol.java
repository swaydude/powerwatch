package powerwatch.matrix.com.pwgen2android.sdk.protocol;

/* JADX INFO: compiled from: Protocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\f\u001a\u00020\u0003H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH&¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;", "", "close", "Lio/reactivex/Completable;", "connectToChannel", "channel", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "getType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "messageOutput", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;", "resubscribe", "sendMessage", "Lio/reactivex/Single;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Protocol {
    io.reactivex.Completable close();

    io.reactivex.Completable connectToChannel(powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel channel);

    powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getType();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> messageOutput();

    io.reactivex.Completable resubscribe();

    io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage> sendMessage(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage message);
}
